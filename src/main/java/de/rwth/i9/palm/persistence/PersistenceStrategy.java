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

	public EventDAO getEventDAO();

	public EventGroupDAO getEventGroupDAO();

	public DatasetDAO getDatasetDAO();

	public ExtractionServiceDAO getExtractionServiceDAO();

	public ExtractionServicePropertyDAO getExtractionServicePropertyDAO();

	public FunctionDAO getFunctionDAO();

	public InstitutionDAO getInstitutionDAO();

	public InterestDAO getInterestDAO();

	public InterestProfileDAO getInterestProfileDAO();

	public InterestProfilePropertyDAO getInterestProfilePropertyDAO();

	public LocationDAO getLocationDAO();

	public PalmConfigurationDAO getPalmConfigurationDAO();

	public PublicationDAO getPublicationDAO();

	public PublicationFileDAO getPublicationFileDAO();

	public PublicationHistoryDAO getPublicationHistoryDAO();

	public PublicationSourceDAO getPublicationSourceDAO();

	public PublicationTopicDAO getPublicationTopicDAO();

	public ReferenceDAO getReferenceDAO();

	public RoleDAO getRoleDAO();

	public SessionDataSetDAO getSessionDataSetDAO();

	public SourceDAO getSourceDAO();

	public SourcePropertyDAO getSourcePropertyDAO();

	public SubjectDAO getSubjectDAO();

	public UserDAO getUserDAO();

	public UserRequestDAO getUserRequestDAO();

	public WidgetDAO getWidgetDAO();
}
