package com.ghag.rnd.rest.services.crud;

import java.util.Collection;
import java.util.HashMap;

public class PartyServiceMapImpl implements PartyService {
	
	private static HashMap<Long, Party> parties = new HashMap<Long, Party>();
	
	public PartyServiceMapImpl() {
		if(parties.size() == 0){
			for(int i = 0 ; i < 65; i++)
				parties.put(new Long(i), new Party(i));
		}
	}

	@Override
	public void insert(Party party) {
		System.out.println("inside insert with "+party);
		parties.put(party.getPartyId(), party);
		//System.out.println("inside insert with "+parties);
	}

	@Override
	public void update(Party party) {
		System.out.println("inside update with "+party);
		parties.put(party.getPartyId(), party);
		//System.out.println("inside update with "+parties);
	}

	@Override
	public void delete(Party party) {
		System.out.println("inside delete with "+party);
		parties.remove(party.getPartyId());	
		//System.out.println("inside delete with "+parties);
	}

	@Override
	public Party getByPk(Long partyId) {
		System.out.println(parties.get(partyId));
		//System.out.println("inside getByPk with "+parties);
		return parties.get(partyId);
	}

	@Override
	public Collection<Party> getAll() {
		//System.out.println(parties.values());
		return parties.values();
	}

}
