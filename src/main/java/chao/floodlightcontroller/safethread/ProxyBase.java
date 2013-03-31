package chao.floodlightcontroller.safethread;

/**
 * The base function for all proxies. There is not get or set function to the member of pThread
 * @author shichao
 *
 */
public abstract class ProxyBase {

	protected final FloodlightModuleRunnable pThread;

	protected ProxyBase(FloodlightModuleRunnable thread) {
		this.pThread = thread;
	}

}
