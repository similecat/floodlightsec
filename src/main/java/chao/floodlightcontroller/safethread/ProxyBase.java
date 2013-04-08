package chao.floodlightcontroller.safethread;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import chao.floodlightcontroller.safethread.message.ApiRequest;
import chao.floodlightcontroller.safethread.message.ApiResponse;

/**
 * The base function for all proxies. There is not get or set function to the
 * member of pThread
 * 
 * @author shichao
 * 
 */
public abstract class ProxyBase {

	protected final long id;
	protected final FloodlightModuleRunnable thread;
	protected Queue<ApiResponse> response_queue;
	protected Object inboundMonitor;
	protected Object apiLock;

	protected ProxyBase(long id, FloodlightModuleRunnable thread) {
		this.id = id;
		this.thread = thread;
		this.response_queue = new ConcurrentLinkedQueue<ApiResponse>();
		this.inboundMonitor = new Object();
		this.apiLock = new Object();
	}

	public long getId() {
		return this.id;
	}

	protected void voidApiCall(String method, List<Object> args) {
		synchronized (apiLock) {
			ApiRequest req = new ApiRequest(id, method, args);
			this.writeApiRequestToKernelQueue(req);
		}
	}

	protected Object fullApiCall(String method, List<Object> args) {
		synchronized (apiLock) {
			ApiRequest req = new ApiRequest(id, method, args);
			this.writeApiRequestToKernelQueue(req);
			ApiResponse res = this.readResponseFromQueue();
			if (res.getResourceId() != this.id || !res.getMethod().equals(method) ) {
				System.err.println("Api Result dispatchted to the wrong place");
				return null;
			} else{
				return res.getReturnValue();
			}
		}
	}

	private void writeApiRequestToKernelQueue(ApiRequest req) {
		// TODO
	}
	
	public void writeReponseToProxyQueue(ApiResponse res) {
		response_queue.add(res);
		synchronized (inboundMonitor) {
			inboundMonitor.notifyAll();
		}
	}

	/**
	 * This function is waiting on the response queue until it is not empty
	 * 
	 * @return Always return true
	 */
	private boolean waitResponseFromQueue() {
		while (response_queue.isEmpty()) {
			synchronized (inboundMonitor) {
				try {
					inboundMonitor.wait();
				} catch (InterruptedException e) {
					System.err.println("Read response from queue interrupted");
					e.printStackTrace();
				}
			}
		}
		return true;
	}

	/**
	 * This function will wait on the queue for a maximum of n seconds. If the
	 * queue is ready for reading by that time, return the true, else return
	 * false.
	 * 
	 * @param n
	 *            Patience Time in seconds. 0 means no timeout, same as
	 *            waitResponseFromQueue()
	 * @return True if the queue is ready for read and false if timeout
	 */
	private boolean waitResponseFromQueue(int n) {

		if (n == 0) {
			return waitResponseFromQueue();
		}

		long start = System.currentTimeMillis();
		while (response_queue.isEmpty()
				&& System.currentTimeMillis() - start < n * 1000) {
			synchronized (inboundMonitor) {
				try {
					inboundMonitor.wait(1000);
				} catch (InterruptedException e) {
					System.err.println("Read response from queue interrupted");
					e.printStackTrace();
				}
			}
		}
		if (!response_queue.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This blocking function will read from the response queue until successful
	 * 
	 * @return The API call response
	 */
	private ApiResponse readResponseFromQueue() {
		this.waitResponseFromQueue();
		return response_queue.poll();
	}
}
