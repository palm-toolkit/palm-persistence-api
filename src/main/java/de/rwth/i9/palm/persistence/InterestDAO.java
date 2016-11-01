package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.Interest;

public interface InterestDAO extends GenericDAO<Interest>, InstantiableDAO
{
	public Interest getInterestByTerm( String term );

	public List<Interest> allTerms();

	public Map<String, Object> allTermsByPaging( String query, Integer pageNo, Integer maxResult );

}
