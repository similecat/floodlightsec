package net.floodlightcontroller.core.deputy;

import java.util.Map;

import chao.floodlightcontroller.safethread.message.ApiRequest;

import net.floodlightcontroller.util.QueueReader;
import net.floodlightcontroller.util.QueueWriter;

public class KernelDeputy implements Runnable {
	protected QueueReader<ApiRequest> apiRequestQueueReader;
	protected QueueWriter<ApiRequest> apiRequestQueueWriter; // Shared with ProxySanitizer
	protected Map<Long, Object> id2ObjectMap;  // Shared with ProxySanitizer
	//public static Object monitor = new Object();	
	//public static Queue<List<Object>> taskQueue = new ConcurrentLinkedQueue<List<Object>>();
	
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
