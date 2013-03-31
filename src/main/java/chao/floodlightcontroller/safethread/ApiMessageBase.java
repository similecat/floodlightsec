package chao.floodlightcontroller.safethread;

public class ApiMessageBase {

	private String method;

	public ApiMessageBase() {

	}

	public ApiMessageBase(String method) {
		this.method = method;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
