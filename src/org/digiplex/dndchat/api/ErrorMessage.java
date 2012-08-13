package org.digiplex.dndchat.api;

public class ErrorMessage extends Message {
	public static enum Error {
		UNKNOWN(0x0),
		
		NOT_ALLOWED(0x10),
		
		INVALID_VERSION(0x90),
		MALFORMATTED_MESSAGE(0x91),
		;
		
		private byte val;
		private Error(int val) {
			this.val = (byte)val;
		}
	}

	@Override protected byte[] serializeSelf() {
		return null;
	}

}
