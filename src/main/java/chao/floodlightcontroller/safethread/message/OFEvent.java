package chao.floodlightcontroller.safethread.message;

import net.floodlightcontroller.util.QueueWriter;

public abstract class OFEvent {
	public enum Type{
		OFMessage, Device
	}
	
	private final Type type;
	private final QueueWriter<OFEventResponse> responseWriter;
	
	public OFEvent(Type type, QueueWriter<OFEventResponse> qr){
		this.type = type;
		this.responseWriter = qr;
	}
	
	public Type getEventType(){
		return this.type;
	}
	
	public QueueWriter<OFEventResponse> getResponseWriter() {
		return this.responseWriter;
	}
}
