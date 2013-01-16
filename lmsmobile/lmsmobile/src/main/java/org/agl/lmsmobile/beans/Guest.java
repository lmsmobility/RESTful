package org.agl.lmsmobile.beans;

import java.util.Map;
import java.util.Properties;

import org.agl.lmsmobile.beans.interfaces.IAddress;
import org.agl.lmsmobile.beans.interfaces.IGuest;

public class Guest implements IGuest {
	private Map<String,BaseAddress> guestAddresses;
	private String firstName;
	private String lastName;
	private String aliasName;
	private Properties phoneNumbers;
	public Guest(){
		
	}
	
	

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAddress() {
		// TODO Auto-generated method stub
		
	}

	
	



	public Map<String, BaseAddress> getGuestAddresses() {
		return guestAddresses;
	}



	public void setGuestAddresses(Map<String, BaseAddress> guestAddresses) {
		this.guestAddresses = guestAddresses;
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



	public Properties getPhoneNumbers() {
		return phoneNumbers;
	}



	public void setPhoneNumbers(Properties phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	

}
