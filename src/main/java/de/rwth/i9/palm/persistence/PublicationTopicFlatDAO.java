package de.rwth.i9.palm.persistence;

import de.rwth.i9.palm.model.PublicationTopicFlat;

public interface PublicationTopicFlatDAO extends GenericDAO<PublicationTopicFlat>, InstantiableDAO
{
	public boolean publicationIdExists( String authorId );
}