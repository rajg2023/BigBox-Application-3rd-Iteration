package bigbox.db;

import bigbox.business.Store;

/**
 * The Interface StoreWriter.
 */
public interface StoreWriter {

	/**
	 * Adds the store.
	 *
	 * @param s the s
	 * @return true, if successful
	 */
	public boolean addStore(Store s);

	/**
	 * Update store.
	 *
	 * @param s the s
	 * @return true, if successful
	 */
	public boolean updateStore(Store s);

	/**
	 * Delete store.
	 *
	 * @param s the s
	 * @return true, if successful
	 */
	public boolean deleteStore(Store s);

}
