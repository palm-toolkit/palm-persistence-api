package de.rwth.i9.palm.persistence;

import java.util.Map;

import de.rwth.i9.palm.model.Author;
import de.rwth.i9.palm.model.Circle;

public interface CircleDAO extends GenericDAO<Circle>, InstantiableDAO
{
	/**
	 * Get circle from given query in pagination
	 * 
	 * @param query
	 * @param creator
	 * @param pageNo
	 * @param maxResult
	 * @param orderBy
	 * @return
	 */
	public Map<String, Object> getCircleWithPaging( String query, Author creator, int pageNo, int maxResult, String orderBy );
}