package de.rwth.i9.palm.persistence;

import de.rwth.i9.palm.model.Author;

public interface AuthorDAO extends GenericDAO<Author>, InstantiableDAO
{

	public Author getByLastName( String lastName );

	public Author getByUri( String uri );
}
