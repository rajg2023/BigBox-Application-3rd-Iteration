package bigbox.db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import bigbox.business.Store;

/**
 * The Class StoreTextFile.
 */
public class StoreTextFile implements StoreDAO {
	
	/** The stores. */
	private static ArrayList<Store> stores = null;
	
	/** The stores path. */
	private Path storesPath = null;
	
	/** The stores file. */
	@SuppressWarnings("unused")
	private File storesFile = null;

	/** The field sep. */
	private final String FIELD_SEP = "\t";

	/**
	 * Instantiates a new store text file.
	 */
	public StoreTextFile() {
		storesPath = Paths.get("stores.txt");
		storesFile = storesPath.toFile();
		stores = getStores();
	}

	/* (non-Javadoc)
	 * @see bigbox.db.StoreReader#getStores()
	 */
	public ArrayList<Store> getStores() {
		if (stores != null)
			return stores;
		stores = new ArrayList<>();
		if (Files.exists(storesPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader("stores.txt"))) {
				String line = in.readLine();
				while (line != null) {
					String[] columns = line.split(FIELD_SEP);
					String infID = columns[0];
					String inDiv = columns[1];
					String inStore = columns[2];
					String inSales = columns[3];
					String inName = columns[4];
					String inAddress = columns[5];
					String inCity = columns[6];
					String inState = columns[7];
					String inZipCode = columns[8];

					Store s = new Store(infID, inDiv, inStore, Double.parseDouble(inSales), inName, inAddress, inCity,
							inState, inZipCode);
					stores.add(s);
					line = in.readLine();
				}
			} catch (IOException e) {
				System.out.println(e);
				return null;
			}
		}
		return stores;
	}

	/* (non-Javadoc)
	 * @see bigbox.db.StoreDAO#getAllStoresWithInDivison(java.lang.String)
	 */
	@Override
	public ArrayList<Store> getAllStoresWithInDivison(String inDiv) {
		ArrayList<Store> storesForDiv = new ArrayList<>();
		for (Store s : stores) {
			if (s.getDivisionNumber().equals(inDiv)) {
				storesForDiv.add(s);
			}

		}
		return stores;
	}

	/* (non-Javadoc)
	 * @see bigbox.db.StoreReader#getStore(java.lang.String, java.lang.String)
	 */
	@Override
	public Store getStore(String inDiv, String inStore) {
		for (Store s : stores) {
			if (s.getDivisionNumber().equals(inDiv) && s.getStoreNumber().equals(inStore))
				return s;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see bigbox.db.StoreWriter#addStore(bigbox.business.Store)
	 */
	@Override
	public boolean addStore(Store s) {
		stores.add(s);

		return this.saveStores();
	}

	/* (non-Javadoc)
	 * @see bigbox.db.StoreWriter#updateStore(bigbox.business.Store)
	 */
	@Override
	public boolean updateStore(Store newStore) {
		// get the old customer and remove it
		Store oldStore = this.getStore(newStore.getDivisionNumber(), newStore.getStoreNumber());
		int i = stores.indexOf(oldStore);
		stores.remove(i);

		// add the updated customer
		stores.add(i, newStore);

		return this.saveStores();

	}

	/* (non-Javadoc)
	 * @see bigbox.db.StoreWriter#deleteStore(bigbox.business.Store)
	 */
	@Override
	public boolean deleteStore(Store s) {
		stores.remove(s);
		return this.saveStores();
	}

	/**
	 * Save stores.
	 *
	 * @return true, if successful
	 */
	private boolean saveStores() {

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("stores.txt")))) {
			for (Store s : stores) {
				out.print(s.getId() + FIELD_SEP);
				out.print(s.getDivisionNumber() + FIELD_SEP);
				out.print(s.getStoreNumber() + FIELD_SEP);
				out.print(s.getSales() + FIELD_SEP);
				out.print(s.getName() + FIELD_SEP);
				out.print(s.getAddress() + FIELD_SEP);
				out.print(s.getCity() + FIELD_SEP);
				out.print(s.getState() + FIELD_SEP);
				out.print(s.getZipCode() + FIELD_SEP);
				// out.print(s.getDivisionNumber() + FIELD_SEP);
			}
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

}
