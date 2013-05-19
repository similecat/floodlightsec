package net.floodlightcontroller.util;

import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueueReader<T> {
	public static final long TIMEOUT = 500;
	public static final int QUEUE_SIZE = 1024;
	
	private final Object monitor;
	private final BlockingQueue<T> queue;
	
	protected static Logger log = LoggerFactory.getLogger(QueueReader.class);
	
	public QueueReader(Object m, BlockingQueue<T> q) {
		monitor = m;
		queue = q;
	}

	/**
	 * Wait until being notified or timeout or interrupted.
	 */
	public void waits() {
		synchronized(monitor) {
			try {
				monitor.wait(QueueReader.TIMEOUT);
			} catch (InterruptedException e) {
				// throw(e);
				return;
			}
		}
	}
	
	/**
	 * Wait until being notified or timeout or interrupted.
	 */
	public void waitsNoTimeout() {
		synchronized(monitor) {
			try {
				monitor.wait();
			} catch (InterruptedException e) {
				// throw(e);
				return;
			}
		}
	}
	
	/**
	 * Read the top element from queue.
	 * @return Return null if queue is empty.
	 */
	public T read() {
		try {
			return queue.take();
		} catch (InterruptedException e) {
			log.error("BlockingQueue interrupted.");
			return null;
		}
//		return queue.poll();
	}
	
	public T pollingRead() {
		while(queue.isEmpty()) {
			// do nothing
		}
		return queue.poll();
	}
}
