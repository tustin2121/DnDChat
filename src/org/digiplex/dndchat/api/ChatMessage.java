package org.digiplex.dndchat.api;

/**
 * Messages between chat clients. 
 * @author tpittman
 */
public class ChatMessage extends Message {

	@Override protected byte[] serializeSelf() {
		//Format version 1
		//	1 byte = message type
		//	1 byte = number of recipiants
		//	for each recipient:
		//		1 byte = member number
		//	2 bytes = message length
		//	ml number of java chars (2 bytes) = message
		// 	1 byte = null terminator
		return null;
	}

}
