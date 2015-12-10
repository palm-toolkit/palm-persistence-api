package de.rwth.i9.palm.persistence;

import java.util.List;

import de.rwth.i9.palm.model.EventGroup;

public interface EventGroupDAO extends GenericDAO<EventGroup>, InstantiableDAO
{

	public EventGroup getEventGroupByEventNameOrNotation( String eventNameOrNotation );

	public List<EventGroup> getEventGroupListWithPaging( String queryString, String type, int pageNo, int maxResult );

	public List<EventGroup> getEventGroupListFullTextSearchWithPaging( String queryString, String type, int pageNo, int maxResult );
}
