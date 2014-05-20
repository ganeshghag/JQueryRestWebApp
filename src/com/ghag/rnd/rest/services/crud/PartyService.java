package com.ghag.rnd.rest.services.crud;

import java.util.Collection;

public interface PartyService {
	
	public void insert(Party party);
	public void update(Party party);
	public void delete(Party party);
	public Party getByPk(Long partyId);
	public Collection<Party> getAll();

}
