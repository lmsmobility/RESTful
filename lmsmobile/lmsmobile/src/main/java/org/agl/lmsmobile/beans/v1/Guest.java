package org.agl.lmsmobile.beans.v1;

import org.agl.lmsmobile.beans.interfaces.IGuest;

public class Guest implements IGuest {
	private GuestAddress guestAddress;
	private String firstName;
	private String lastName;
	private String aliasName;
	
	public Guest(){
		
	}
	
	public Guest(GuestAddress guestAddress){
		this.guestAddress = guestAddress;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAddress() {
		// TODO Auto-generated method stub
		
	}

	public GuestAddress getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(GuestAddress guestAddress) {
		this.guestAddress = guestAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	
	

}
