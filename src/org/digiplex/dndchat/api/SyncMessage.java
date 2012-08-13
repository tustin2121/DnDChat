package org.digiplex.dndchat.api;

/**
 * A Sync message is sent to the server when the client wishes to completely refresh the state of the client,
 * in the event that the client and server's states have become out of sync.
 * 
 * Sync order: When the server answers a sync request, it queues up all the standard messages in a certain 
 * order so that the client can be properly prepared.
 * 		ACK = acknoledge the sync
 * 		GROUP_CREATE & GROUP_MOD = for every group
 * 		MEMBER_ADD & MEMBER_GROUP_MOD = for every member
 * 		INIT_LINEUP = for the initiative lineup, if applicable
 * @author tpittman
 */
public class SyncMessage extends Message {
	
	@Override protected byte[] serializeSelf() {
		return null;
	}

}
