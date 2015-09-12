package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.ExtractionService;

public interface ExtractionServiceDAO extends GenericDAO<ExtractionService>, InstantiableDAO
{
	public List<ExtractionService> getAllExtractionProfile();

	public List<ExtractionService> getAllActiveExtractionService();

	public Map<String, ExtractionService> getExtractionServiceMap();
}
