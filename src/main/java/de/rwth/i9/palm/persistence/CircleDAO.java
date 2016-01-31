package de.rwth.i9.palm.persistence;

import java.util.Map;

import de.rwth.i9.palm.model.Author;
import de.rwth.i9.palm.model.Circle;

public interface CircleDAO extends GenericDAO<Circle>, InstantiableDAO
{
	/**
	 * Trigger batch indexing using Hibernate search powered by Lucene
	 * 
	 * @throws InterruptedException
	 */
	public void doReindexing() throws InterruptedException;

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
	public Map<String, Object> getCircleFullTextSearchWithPaging( String query, Author creator, int pageNo, int maxResult, String orderBy );
}