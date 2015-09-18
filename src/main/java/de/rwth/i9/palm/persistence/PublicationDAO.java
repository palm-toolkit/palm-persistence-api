package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.Author;
import de.rwth.i9.palm.model.Event;
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
	 * @return Map<String, Object>
	 *         Map< "count", Int numberOfMatchingPublication > - the total
	 *         number of matching publications 
	 *         Map< "result", List<Publication> > - the publication list
	 */
	public Map<String, Object> getPublicationByFullTextSearchWithPaging( String query, int page, int maxResult );

	/**
	 * Get all publication in pagination based on event
	 * 
	 * @param pageNo
	 * @param maxResult
	 * @return
	 */
	public Map<String, Object> getPublicationByEventWithPaging( Event event, int pageNo, int maxResult );
	
	/**
	 * Get publications based on how many words can be between the various words
	 * in the query phrase.
	 * 
	 * @param publicationTitle
	 * @param slope
	 * @return
	 */
	public List<Publication> getPublicationViaPhraseSlopQuery( String publicationTitle, int slope );

	/**
	 * Get publications given any number of authors (coauthors)
	 * 
	 * @param coauthors
	 * @return
	 */
	public List<Publication> getPublicationByCoAuthors( Author... coauthors );
}
