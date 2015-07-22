package de.rwth.i9.palm.persistence;

/**
 * This interface is a Factory-interface for any DAO that is needed in this
 * application.
 */
public interface PersistenceStrategy
{
	public AuthorDAO getAuthorDAO();

	public AuthorSourceDAO getAuthorSourceDAO();

	public ConferenceDAO getConferenceDAO();

	public ConferenceGroupDAO getConferenceGroupDAO();

	public DatasetDAO getDatasetDAO();

	public ExtractionServiceDAO getExtractionServiceDAO();

	public FunctionDAO getFunctionDAO();

	public InstitutionDAO getInstitutionDAO();

	public LocationDAO getLocationDAO();

	public PalmConfigurationDAO getPalmConfigurationDAO();

	public PublicationDAO getPublicationDAO();

	public PublicationHistoryDAO getPublicationHistoryDAO();

	public PublicationSourceDAO getPublicationSourceDAO();

	public PublicationTopicDAO getPublicationTopicDAO();

	public ReferenceDAO getReferenceDAO();

	public RoleDAO getRoleDAO();

	public ExtractionRuntimeDAO getExtractionRuntimeDAO();

	public SessionDataSetDAO getSessionDataSetDAO();

	public SourceDAO getSourceDAO();

	public SubjectDAO getSubjectDAO();

	public UserDAO getUserDAO();

	public UserRequestDAO getUserRequestDAO();

	public WidgetDAO getWidgetDAO();
}
