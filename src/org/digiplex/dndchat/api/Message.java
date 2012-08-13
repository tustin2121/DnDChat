package org.digiplex.dndchat.api;

public abstract class Message {
	public static enum Type {
		KEEP_ALIVE(0x00),
		ACK(0x01),
		SYNC(0x02), //sync request = ask the server to refresh my complete chat state
		
		LOGIN_REQUEST(0x10), 	//login phase 1 = ask server for login
		LOGIN_WAITING(0x11), 	//login phase 2 = server acks with an "awaiting approval" reply
		LOGIN_APPROVED(0x12), 	//login phase 3 = server approves login
		LOGIN_DENIED(0x13), 	//login phase 3 = server denies your login request
		LOGOUT(0x19),			//logout of server, on shutdown, or forced logout from server
		
		MEMBER_ADD(0x20), 		//add new member to play
		MEMBER_DROP(0x21), 		//remove member from play
		MEMBER_GROUP_MOD(0x22),	//modify group membership for a single member
		MEMBER_MOD(0x23),		//modify the properties on a member
		
		GROUP_CREATE(0x30),		//create a new group
		GROUP_DELETE(0x31),		//delete a group
		GROUP_MOD(0x32),		//modify a group's properties (name, color, etc)
		
		INIT_REQUEST(0x50), //request initiative from group members, or reply to request
		INIT_LINEUP(0x51), //modification to the displayed lineup
		INIT_ALERT(0x52), //alert member that they have initiative, via flashy screen or sound
		
		CHAT_MESSAGE(0xF0),
		ERROR(0xFF), //all error messages
		;
		
		private byte val;
		private Type(int val) {
			this.val = (byte)val;
		}
		
	}
	
	protected abstract byte[] serializeSelf();
}
