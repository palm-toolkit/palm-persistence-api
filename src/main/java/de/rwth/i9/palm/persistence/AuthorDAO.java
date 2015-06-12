package de.rwth.i9.palm.persistence;

import java.util.List;

import de.rwth.i9.palm.model.Author;

public interface AuthorDAO extends GenericDAO<Author>, InstantiableDAO
{

	public Author getByLastName( String lastName );

	public Author getByUri( String uri );

	/**
	 * Apply fulltext searh with hibernate search
	 * 
	 * @param queryString
	 * @return
	 */
	public List<Author> getAuthorByFUllTextSearch( String queryString );
}
