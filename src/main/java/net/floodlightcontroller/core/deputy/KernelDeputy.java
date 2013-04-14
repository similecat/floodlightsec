package net.floodlightcontroller.core.deputy;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import chao.floodlightcontroller.safethread.message.ApiRequest;

import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;

public class KernelDeputy implements Runnable {
	protected final QueueReader<ApiRequest> apiRequestQueueReader;
	protected final QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with ProxySanitizer
	protected final Map<Long, Object> id2ObjectMap;  // Shared with ProxySanitizer
	//public static Object monitor = new Object();	
	//public static Queue<List<Object>> taskQueue = new ConcurrentLinkedQueue<List<Object>>();
	
	public KernelDeputy() {
		Object apiMonitor = new Object();
		Queue<ApiRequest> apiQueue = new ConcurrentLinkedQueue<ApiRequest>();
		apiRequestQueueWriter = new QueueWriter<ApiRequest>(apiMonitor, apiQueue);
		apiRequestQueueReader = new QueueReader<ApiRequest>(apiMonitor, apiQueue);
		
		id2ObjectMap = new HashMap<Long, Object>();
	}
	
	public QueueWriter<ApiRequest> getApiRequestQueueWriter() {
		return apiRequestQueueWriter;
	}

	public Map<Long, Object> getId2ObjectMap() {
		return id2ObjectMap;
	}
	
	@Override
	public void run() {
		while (true) {
			// Wait for incoming API calls
			apiRequestQueueReader.waits();
			
			// Process API calls until queue gets empty
			ApiRequest task = apiRequestQueueReader.read();
			while (task!=null) {
				// Translate request
				
				// Check permissions
				
				// Execute request
				
				// Send back response if necessary
				
				task = apiRequestQueueReader.read();
			}
			
		}

	}
}
