package com.ghag.rnd.rest.services.crud;

import java.util.Collection;

public class Parties {
	
	private Collection<Party> list;
	
	public Parties(){
		
	}
	
	public Parties(Collection<Party> parties){
		list = parties;
	}
	
	public Collection<Party> getList() {
		return list;
	}
	
	public void setList(Collection<Party> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parties [list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}
	
	

}
