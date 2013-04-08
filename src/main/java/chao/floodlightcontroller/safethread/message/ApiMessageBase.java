package chao.floodlightcontroller.safethread.message;

public class ApiMessageBase {

	private final String method;
	private final long id;

	public ApiMessageBase(long id, String method) {
		this.method = method;
		this.id = id;
	}

	public String getMethod() {
		return method;
	}
	
	public long getResourceId(){
		return this.id;
	}

}
