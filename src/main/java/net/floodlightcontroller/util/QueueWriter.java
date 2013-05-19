package net.floodlightcontroller.util;

import java.util.concurrent.BlockingQueue;

public class QueueWriter<T> {
	private final Object monitor;
	private final BlockingQueue<T> queue;

	public QueueWriter(Object m, BlockingQueue<T> q) {
		monitor = m;
		queue = q;
	}
	
	public void notifies() {
		synchronized(monitor) {
			monitor.notifyAll();
		}
	}
	
	public boolean write(T t) {
		return queue.add(t);
	}
}
