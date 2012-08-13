package org.digiplex.dndchat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class ChatServer extends Thread {
	private static final Logger LOG = Logger.getLogger("ChatServer");
	
	protected ServerSocket inSock;
	private volatile boolean isRunning = true;
	
	
	public ChatServer(int port) throws IOException {
		super("Chat Server Thread");
		
		inSock = new ServerSocket(port);
	}
	
	@Override public void run() {
		while (isRunning) {
			try {
				Socket newClient = inSock.accept();
				LOG.info("Accepted connection from "+newClient.getInetAddress().getHostAddress());
				
				
			} catch (Exception ex) {
				
			}
		}
	}
}
