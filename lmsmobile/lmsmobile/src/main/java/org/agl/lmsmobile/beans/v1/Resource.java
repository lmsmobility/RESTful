package org.agl.lmsmobile.beans.v1;

import org.agl.lmsmobile.beans.interfaces.IResource;

public class Resource implements IResource{
	private Guest guest;
	private PropertyAddress propertyAddress;
	
	public Resource(){
		
	}
	
	public String pingMe(String yourName){
		return "Hello " + yourName;
	}
	
	public Resource(Guest guest, PropertyAddress propertyAddress){
		
		this.guest = guest;
		this.propertyAddress = propertyAddress;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		addGuest();
		addPropertyAddress();
	}

	@Override
	public void addGuest() {
		// TODO Auto-generated method stub
		guest.setFirstName("Matt");
		guest.setLastName("Somebody");
		guest.setAliasName("Matty Matt");
		guest.getGuestAddress().setAddress("101 DIY Lane");
		guest.getGuestAddress().setAddress1("");
		guest.getGuestAddress().setCity("Atlanta");
		guest.getGuestAddress().setStateCode("GA");
		guest.getGuestAddress().setState("Georgia");
		guest.getGuestAddress().setCountryCode("USA");
		guest.getGuestAddress().setCountry("United States of America");
		
	}

	@Override
	public void addPropertyAddress() {
		// TODO Auto-generatedpropertyAddress.
		propertyAddress.setAddress("101 Money Dr");
		propertyAddress.setAddress1("");
		propertyAddress.setCity("Atlantic City");
		propertyAddress.setStateCode("NJ");
		propertyAddress.setState("New Jersey");
		propertyAddress.setCountryCode("USA");
		propertyAddress.setCountry("United States of America");
		
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public PropertyAddress getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(PropertyAddress propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	
	

}
