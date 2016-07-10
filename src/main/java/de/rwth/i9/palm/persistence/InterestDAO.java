package de.rwth.i9.palm.persistence;

import java.util.List;

import de.rwth.i9.palm.model.Interest;

public interface InterestDAO extends GenericDAO<Interest>, InstantiableDAO
{
	public Interest getInterestByTerm( String term );

	public List<Interest> allTerms();
}
