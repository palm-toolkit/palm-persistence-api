package de.rwth.i9.palm.persistence;

/**
 * This class is a Factory-class for any DAO that is needed in this application.
 */
public interface PersistenceStrategy
{
	public AlgorithmDAO getAlgorithmDAO();

	public AuthorAliasDAO getAuthorAliasDAO();

	public AuthorDAO getAuthorDAO();

	public InstitutionDAO getInstitutionDAO();

	public KeywordDAO getKeywordDAO();

	public LocationDAO getLocationDAO();

	public PublicationDAO getPublicationDAO();

	public PublicationOldDAO getPublicationOldDAO();

	public RoleDAO getRoleDAO();

	public RunTimeDAO getRunTimeDAO();

	public SourceDAO getSourceDAO();

	public TopicDAO getTopicDAO();

	public UserDAO getUserDAO();

	public VenueDAO getVenueDAO();
}
