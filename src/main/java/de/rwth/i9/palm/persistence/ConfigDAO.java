package de.rwth.i9.palm.persistence;

import de.rwth.i9.palm.model.Config;

public interface ConfigDAO extends GenericDAO<Config>, InstantiableDAO
{
	public Config getConfigByName( String configType );

}
