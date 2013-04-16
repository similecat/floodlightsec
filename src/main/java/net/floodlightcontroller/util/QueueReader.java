package net.floodlightcontroller.util;

import java.util.Queue;

public class QueueReader<T> {
	public static final long TIMEOUT = 500;
	private final Object monitor;
	private final Queue<T> queue;
	
	public QueueReader(Object m, Queue<T> q) {
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
		return queue.poll();
	}
}
