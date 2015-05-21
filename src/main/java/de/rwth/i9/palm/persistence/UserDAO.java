package de.rwth.i9.palm.persistence;

import de.rwth.i9.palm.model.User;

public interface UserDAO extends GenericDAO<User>, InstantiableDAO
{
	/**
	 * @param user
	 * @param functionName
	 * @return
	 */
	public boolean isAuthorizedForFunction( final User user, final String functionName );

	/**
	 * Get user object by username
	 * 
	 * @param username
	 * @return
	 */
	public User getByUsername( final String username );
}
