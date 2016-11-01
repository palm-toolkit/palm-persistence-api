package de.rwth.i9.palm.persistence;

import java.util.List;

import de.rwth.i9.palm.model.PublicationTopic;

public interface PublicationTopicDAO extends GenericDAO<PublicationTopic>, InstantiableDAO
{
	public List<String> allTopics();
}
