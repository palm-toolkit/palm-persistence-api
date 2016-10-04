package de.rwth.i9.palm.persistence;

import de.rwth.i9.palm.model.AuthorInterestFlat;

public interface AuthorInterestFlatDAO extends GenericDAO<AuthorInterestFlat>, InstantiableDAO
{
	public boolean authorIdExists( String authorId );
}