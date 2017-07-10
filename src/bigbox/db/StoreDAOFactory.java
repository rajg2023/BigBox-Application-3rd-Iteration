package bigbox.db;
/**
 * A factory for creating StoreDAO objects.
 */
public class StoreDAOFactory {

	// this method maps the ProductDAO interface to the appropriate data storage
	/**
	 * Gets the store DAO.
	 *
	 * @return the store DAO
	 */
	// mechanism
	public static StoreDAO getStoreDAO() {
		StoreDAO sDAO = new StoreTextFile();
		return sDAO;
	}

}
