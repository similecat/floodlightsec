package chao.floodlightcontroller.safethread;

public class ApiMessageBase {

	private final String method;

	public ApiMessageBase(String method) {
		this.method = method;
	}

	public String getMethod() {
		return method;
	}

}
