package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.InterestProfile;

public interface InterestProfileDAO extends GenericDAO<InterestProfile>, InstantiableDAO
{
	public List<InterestProfile> getAllInterestProfile();

	public Map<String, InterestProfile> getInterestProfileMap();
}
