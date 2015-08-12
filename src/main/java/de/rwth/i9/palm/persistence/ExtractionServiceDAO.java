package de.rwth.i9.palm.persistence;

import java.util.List;

import de.rwth.i9.palm.model.ExtractionService;

public interface ExtractionServiceDAO extends GenericDAO<ExtractionService>, InstantiableDAO
{
	List<ExtractionService> getAllActiveExtractionService();
}
