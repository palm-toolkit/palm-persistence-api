package de.rwth.i9.palm.persistence;

/**
 * This interface is a Factory-interface for any DAO that is needed in this
 * application.
 */
public interface PersistenceStrategy
{

	public AuthorAliasDAO getAuthorAliasDAO();

	public AuthorDAO getAuthorDAO();

	public ConferenceDAO getConferenceDAO();

	public DatasetDAO getDatasetDAO();

	public ExtractionServiceDAO getExtractionServiceDAO();

	public FunctionDAO getFunctionDAO();

	public InstitutionDAO getInstitutionDAO();

	public LocationDAO getLocationDAO();

	public PublicationDAO getPublicationDAO();

	public ReferenceDAO getReferenceDAO();

	public RoleDAO getRoleDAO();

	public ExtractionRuntimeDAO getExtractionRuntimeDAO();

	public SessionDataSetDAO getSessionDataSetDAO();

	public SourceDAO getSourceDAO();

	public SubjectDAO getSubjectDAO();

	public PublicationTopicDAO getPublicationTopicDAO();

	public UserDAO getUserDAO();

	public WidgetDAO getWidgetDAO();
}
