package de.rwth.i9.palm.persistence;

import de.rwth.i9.palm.model.EventGroupInterestFlat;

public interface EventGroupInterestFlatDAO extends GenericDAO<EventGroupInterestFlat>, InstantiableDAO
{
	public boolean eventIdExists( String eventId );
}