package de.rwth.i9.palm.persistence;

import java.util.Map;

import de.rwth.i9.palm.model.Conference;

public interface ConferenceDAO extends GenericDAO<Conference>, InstantiableDAO
{
	Map<String, Conference> getNotationConferenceMaps();
}
