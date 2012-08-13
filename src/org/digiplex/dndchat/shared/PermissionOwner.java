package org.digiplex.dndchat.shared;

public class PermissionOwner {
	private int permissions = 0x0;
	private String name;
	
	public boolean hasPermission(int permmap) {
		return (this.permissions & permmap) == permmap;
	}
	
	public void givePermission(int permmap) {
		this.permissions |= permmap;
	}
	public void removePermission(int permmap) {
		this.permissions &= ~permmap;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
