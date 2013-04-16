package net.floodlightcontroller.safethread.message;

import net.floodlightcontroller.core.IListener.Command;

public class OFEventResponse {
	public Command command;
	
	public OFEventResponse(Command c) {
		command = c;
	}
}
