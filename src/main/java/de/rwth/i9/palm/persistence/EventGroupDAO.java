package de.rwth.i9.palm.persistence;

import java.util.List;
import java.util.Map;

import de.rwth.i9.palm.model.EventGroup;

public interface EventGroupDAO extends GenericDAO<EventGroup>, InstantiableDAO
{
	/**
	 * Trigger batch indexing using Hibernate search powered by Lucene
	 * 
	 * @throws InterruptedException
	 */
	public void doReindexing() throws InterruptedException;

	public EventGroup getEventGroupByEventNameOrNotation( String eventNameOrNotation );

	public List<EventGroup> getEventGroupListWithPaging( String queryString, String type, int pageNo, int maxResult );

	public Map<String, Object> getEventGroupMapWithPaging( String queryString, String type, int pageNo, int maxResult );

	public List<EventGroup> getEventGroupListFullTextSearchWithPaging( String queryString, String type, int pageNo, int maxResult );

	public Map<String, Object> getEventGroupMapFullTextSearchWithPaging( String queryString, String type, int pageNo, int maxResult );
}
