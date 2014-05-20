package com.ghag.rnd.rest.services.crud;

public class Party {
	
	private Long partyId;
	private String name;
	private String address;
	private String telephone;
	private String description;
	
	public Party(){
		
	}
	
	public Party(long id) {
		partyId = id;
		name = "Ganesh Ghag"+id;
		address = "The Address for "+id;
		telephone = "9098493-"+id;
		description = "description for "+ id;
	}
	
	public Long getPartyId() {
		return partyId;
	}
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Party [partyId=");
		builder.append(partyId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
