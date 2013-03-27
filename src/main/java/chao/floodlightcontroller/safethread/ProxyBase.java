package chao.floodlightcontroller.safethread;

public class ProxyBase {

	protected FloodlightModuleRunnable pThread;

	protected ProxyBase(FloodlightModuleRunnable thread) {
		this.pThread = thread;
	}

	protected FloodlightModuleRunnable getAppThread() {
		return pThread;
	}

	private boolean setAppThread(FloodlightModuleRunnable thread) {
		pThread = thread;
		return true;
	}

}
