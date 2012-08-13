package org.digiplex.dndchat.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

import org.digiplex.dndchat.shared.PermissionOwner;

public class ClientManager extends Thread {
	private Socket clientSocket;
	
	private PermissionOwner member;
	private BufferedOutputStream out;
	private BufferedInputStream in;
	
	public ClientManager(Socket sock) throws IOException {
		super("Client Manager [Unknown]");
		this.clientSocket = sock;
		out = new BufferedOutputStream(sock.getOutputStream());
		in = new BufferedInputStream(sock.getInputStream());
	}
	
	public void setMember(PermissionOwner member) {
		this.member = member;
		this.setName("Client Manager ["+member+"]");
	}
}
