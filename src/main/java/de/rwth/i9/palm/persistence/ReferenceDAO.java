package de.rwth.i9.palm.persistence;

import de.rwth.i9.palm.model.Reference;

public interface ReferenceDAO extends GenericDAO<Reference>, InstantiableDAO
{

	public Reference getByUri( String uri );

}
