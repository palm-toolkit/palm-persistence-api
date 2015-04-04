package de.rwth.i9.palm.persistence;

/**
 * This interface is a Factory-interface for any DAO that is needed in this
 * application.
 */
public interface PersistenceStrategy
{
	public AlgorithmDAO getAlgorithmDAO();

	public AuthorAliasDAO getAuthorAliasDAO();

	public AuthorDAO getAuthorDAO();

	public DatasetDAO getDatasetDAO();

	public FunctionDAO getFunctionDAO();

	public InstitutionDAO getInstitutionDAO();

	public KeywordDAO getKeywordDAO();

	public LocationDAO getLocationDAO();

	public PublicationDAO getPublicationDAO();

	public PublicationOldDAO getPublicationOldDAO();

	public RoleDAO getRoleDAO();

	public RunTimeDAO getRunTimeDAO();

	public SourceDAO getSourceDAO();

	public TagDAO getTagDAO();

	public TopicDAO getTopicDAO();

	public UserDAO getUserDAO();

	public VenueDAO getVenueDAO();
}
