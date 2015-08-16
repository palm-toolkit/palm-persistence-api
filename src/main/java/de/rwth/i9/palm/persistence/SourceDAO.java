package de.rwth.i9.palm.persistence;

import java.util.Map;

import de.rwth.i9.palm.model.Source;
import de.rwth.i9.palm.model.SourceType;

public interface SourceDAO extends GenericDAO<Source>, InstantiableDAO
{
	public Map<SourceType, Boolean> getActiveSourceMap();
}
