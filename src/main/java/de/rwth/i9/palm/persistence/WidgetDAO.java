package de.rwth.i9.palm.persistence;

import java.util.List;

import de.rwth.i9.palm.model.Widget;
import de.rwth.i9.palm.model.WidgetType;

public interface WidgetDAO extends GenericDAO<Widget>, InstantiableDAO
{
	/**
	 * Get list of specific widgets by their type
	 * 
	 * @param widgetType
	 * @return
	 */
	List<Widget> getActiveWidgetByWidgetType( WidgetType widgetType );

	/**
	 * Get list of specific widgets by their type and group
	 * 
	 * @param widgetType
	 * @return
	 */
	List<Widget> getActiveWidgetByWidgetTypeAndGroup( WidgetType widgetType, String widgetGroup );
}
