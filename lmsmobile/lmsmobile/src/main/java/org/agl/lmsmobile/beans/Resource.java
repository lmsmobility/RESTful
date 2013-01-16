package org.agl.lmsmobile.beans;

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
		guest.setFirstName("Joe");
		guest.setLastName("Somebody");
		guest.setAliasName("Joey Joey");
		guest.getGuestAddresses().get("HOME").setAddress("4060 Yakutia Pl");
		guest.getGuestAddresses().get("HOME").setAddress1("");
		guest.getGuestAddresses().get("HOME").setCity("Cumming");
		guest.getGuestAddresses().get("HOME").setStateCode("GA");
		guest.getGuestAddresses().get("HOME").setState("Georgia");
		guest.getGuestAddresses().get("HOME").setCountryCode("USA");
		guest.getGuestAddresses().get("HOME").setCountry("United States of America");
		guest.getGuestAddresses().get("HOME").setZipCode("30040");
		
		guest.getGuestAddresses().get("WORK").setAddress("1000 Windward Concourse");
		guest.getGuestAddresses().get("WORK").setAddress1("");
		guest.getGuestAddresses().get("WORK").setCity("Alpharetta");
		guest.getGuestAddresses().get("WORK").setStateCode("GA");
		guest.getGuestAddresses().get("WORK").setState("Georgia");
		guest.getGuestAddresses().get("WORK").setCountryCode("USA");
		guest.getGuestAddresses().get("WORK").setCountry("United States of America");
		guest.getGuestAddresses().get("WORK").setZipCode("30005");
		
		guest.getPhoneNumbers().setProperty("HOME", "904-940-1007");
		guest.getPhoneNumbers().setProperty("WORK", "770-810-7938");
	}

	@Override
	public void addPropertyAddress() {
		// TODO Auto-generatedpropertyAddress.
		propertyAddress.setAddress("101 Vegas Strip");
		propertyAddress.setAddress1("");
		propertyAddress.setCity("Las Vegas");
		propertyAddress.setStateCode("NV");
		propertyAddress.setState("Nevada");
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
