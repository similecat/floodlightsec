package chao.floodlightcontroller.safethread;

public class ProxyBase {

	protected FloodlightModuleRunnable pThread;

	protected ProxyBase(FloodlightModuleRunnable thread) {
		this.pThread = thread;
	}

	// This method must be private to protect against the module operate on the AppThread
	private FloodlightModuleRunnable getAppThread() {
		return pThread;
	}

	private boolean setAppThread(FloodlightModuleRunnable thread) {
		pThread = thread;
		return true;
	}

}
