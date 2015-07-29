package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.Conference;
import de.rwth.i9.palm.model.ConferenceGroup;

public interface ConferenceDAO extends GenericDAO<Conference>, InstantiableDAO
{
	/**
	 * Trigger batch indexing using Hibernate search powered by Lucene
	 * 
	 * @throws InterruptedException
	 */
	public void doReindexing() throws InterruptedException;

	/**
	 * Get the map of conferences
	 * 
	 * @return Hashmap with conference notation as key and conference as its
	 *         value
	 */
	Map<String, Conference> getNotationConferenceMaps();

	/**
	 * Get all conference in pagination
	 * 
	 * @param pageNo
	 * @param maxResult
	 * @return
	 */
	public Map<String, Object> getConferenceWithPaging( int pageNo, int maxResult );

	/**
	 * Apply fulltext search with Hibernate search
	 * 
	 * @param queryString
	 * @return list of all related conference
	 */
	public List<Conference> getConferenceByFullTextSearch( String queryString );

	/**
	 * Apply fulltext search with Hibernate search with paging
	 * 
	 * @param queryString
	 * @return Map<String, Object>
	 *         Map< "count", Int numberOfMatchingConference > - the total number
	 *         of matching conferences 
	 *         Map< "result", List<Conference> > - the conference list
	 */
	public Map<String, Object> getConferenceByFullTextSearchWithPaging( String query, int page, int maxResult );

	public List<ConferenceGroup> getConferenceViaFuzzyQuery( String name, float threshold, int prefixLength );
}
