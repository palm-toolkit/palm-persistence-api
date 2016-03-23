package de.rwth.i9.palm.persistence;

/**
 * This interface is a Factory-interface for any DAO that is needed in this
 * application.
 */
public interface PersistenceStrategy
{
	public AuthorDAO getAuthorDAO();

	public AuthorInterestDAO getAuthorInterestDAO();

	public AuthorInterestProfileDAO getAuthorInterestProfileDAO();

	public AuthorSourceDAO getAuthorSourceDAO();

	public AuthorTopicModelingDAO getAuthorTopicModelingDAO();

	public AuthorTopicModelingProfileDAO getAuthorTopicModelingProfileDAO();

	public CircleDAO getCircleDAO();

	public CircleInterestDAO getCircleInterestDAO();

	public CircleInterestProfileDAO getCircleInterestProfileDAO();

	public CircleTopicModelingDAO getCircleTopicModelingDAO();

	public CircleTopicModelingProfileDAO getCircleTopicModelingProfileDAO();

	public CircleWidgetDAO getCircleWidgetDAO();

	public ConfigDAO getConfigDAO();

	public ConfigPropertyDAO getConfigPropertyDAO();

	public CountryDAO getCountryDAO();

	public EventDAO getEventDAO();

	public EventGroupDAO getEventGroupDAO();

	public ExtractionServiceDAO getExtractionServiceDAO();

	public ExtractionServicePropertyDAO getExtractionServicePropertyDAO();

	public FunctionDAO getFunctionDAO();

	public InstitutionDAO getInstitutionDAO();

	public InterestDAO getInterestDAO();

	public InterestProfileDAO getInterestProfileDAO();

	public InterestProfileCircleDAO getInterestProfileCircleDAO();

	public InterestProfilePropertyDAO getInterestProfilePropertyDAO();

	public LocationDAO getLocationDAO();

	public PublicationDAO getPublicationDAO();

	public PublicationAuthorDAO getPublicationAuthorDAO();

	public PublicationFileDAO getPublicationFileDAO();

	public PublicationHistoryDAO getPublicationHistoryDAO();

	public PublicationSourceDAO getPublicationSourceDAO();

	public PublicationTopicDAO getPublicationTopicDAO();

	public RoleDAO getRoleDAO();

	public SessionDataSetDAO getSessionDataSetDAO();

	public SourceDAO getSourceDAO();

	public SourcePropertyDAO getSourcePropertyDAO();

	public SubjectDAO getSubjectDAO();

	public UserDAO getUserDAO();

	public UserPublicationBookmarkDAO getUserPublicationBookmarkDAO();

	public UserRequestDAO getUserRequestDAO();

	public UserWidgetDAO getUserWidgetDAO();

	public TopicModelingAlgorithmAuthorDAO getTopicModelingAlgorithmAuthorDAO();

	public TopicModelingAlgorithmCircleDAO getTopicModelingAlgorithmCircleDAO();

	public WidgetDAO getWidgetDAO();
}
