package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.Conference;
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
	 * Apply fulltext search with Hibernate search
	 * 
	 * @param queryString
	 * @return list of all related publication
	 */
	public List<Publication> getPublicationByFullTextSearch( String queryString );
	
	/**
	 * Apply fulltext search with Hibernate search with paging
	 * 
	 * @param queryString
	 * @return Map<String, Object><br/>
	 *         Map< "count", Int numberOfMatchingPublication > - the total
	 *         number of matching publications <br/>
	 *         Map< "result", List<Publication> > - the publication list
	 */
	public Map<String, Object> getPublicationByFullTextSearchWithPaging( String query, int page, int maxResult );

	/**
	 * Get all publication in pagination based on conference
	 * 
	 * @param pageNo
	 * @param maxResult
	 * @return
	 */
	public Map<String, Object> getPublicationByConferenceWithPaging( Conference conference, int pageNo, int maxResult );
}
