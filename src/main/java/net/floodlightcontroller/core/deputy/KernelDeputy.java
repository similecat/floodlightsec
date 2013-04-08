package net.floodlightcontroller.core.deputy;

import java.io.IOException;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.openflow.protocol.OFPacketOut;

import chao.floodlightcontroller.safethread.message.ApiRequest;

import net.floodlightcontroller.core.FloodlightContext;
import net.floodlightcontroller.core.internal.OFSwitchForApp;

public class KernelDeputy implements Runnable {
	public static Object monitor = new Object();	
	public static Queue<List<Object>> taskQueue = new ConcurrentLinkedQueue<List<Object>>();
	
//	@Override
//	public void run() {
//		while (true) {
//			synchronized(monitor) {
//				try {
//					monitor.wait();
//				} catch (InterruptedException e) {
//					// should not enter here
//				}
//			}
//			
//			List<Object> task = taskQueue.poll();
//			while (task!=null) {
//				// process task
//				OFSwitchForApp sw = (OFSwitchForApp) task.get(0);
//				OFPacketOut po = (OFPacketOut) task.get(1);
//				FloodlightContext cntx = (FloodlightContext) task.get(2);
//				
//				try {
//					sw.mappingSW.write(po,cntx);
//				} catch (IOException e) {
//					// do nothing
//				}
//				
//				task = taskQueue.poll();
//			}
//			
//		}
//
//	}

	public void run() {
		while (true) {
			synchronized(monitor) {
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					// should not enter here
				}
			}
			
			List<Object> task = taskQueue.poll();
			while (task!=null) {
				// process task
				OFSwitchForApp sw = (OFSwitchForApp) task.get(0);
				OFPacketOut po = (OFPacketOut) task.get(1);
				FloodlightContext cntx = (FloodlightContext) task.get(2);
				
				try {
					sw.mappingSW.write(po,cntx);
				} catch (IOException e) {
					// do nothing
				}
				
				task = taskQueue.poll();
			}
			
		}

	}
}
