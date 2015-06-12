package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.Publication;

public interface PublicationDAO extends GenericDAO<Publication>, InstantiableDAO
{
	/**
	 * Trigger batch indexing using Hibernate search powered by Lucene
	 * 
	 * @throws InterruptedException
	 */
	public void doReindexing() throws InterruptedException;

	/**
	 * Get all publication in pagination
	 * 
	 * @param pageNo
	 * @param maxResult
	 * @return
	 */
	public Map<String, Object> getPublicationWithPaging( int pageNo, int maxResult );

	/**
	 * Apply fulltext searh with hibernate search
	 * 
	 * @param queryString
	 * @return list of all related publication
	 */
	public List<Publication> getPublicationByFUllTextSearch( String queryString );
	
	/**
	 * Apply fulltext searh with hibernate search with pagging
	 * 
	 * @param queryString
	 * @return Map<String, Object><br/>
	 * 	Map< "count", Int numberOfMatchingPublication > -  the total number of matching publications <br/>
	 *  Map< "result", List<Publication> > -  the publication list
	 */
	public Map<String, Object> getPublicationByFUllTextSearchWithPaging( String queryString, int pageNo, int maxResult);
}
