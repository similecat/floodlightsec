package chao.floodlightcontroller.safethread.message;

public class OFEvent {
	public enum Type{
		OFMessage, Device
	}
	
	private final Type type;
	
	public OFEvent(Type type){
		this.type = type;
	}
	
	public Type getEventType(){
		return this.type;
	}
}
