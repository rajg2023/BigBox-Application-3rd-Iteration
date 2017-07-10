package bigbox.business;
/**
 * The Class Facility.
 */
public class Facility {

	/** The id. */
	private String id;
	
	/** The name. */
	protected String name;
	
	/** The address. */
	protected String address;
	
	/** The city. */
	protected String city;
	
	/** The state. */
	protected String state;
	
	/** The zip code. */
	protected String zipCode;

	/**
	 * Instantiates a new facility.
	 */
	public Facility() {
		id = "";
		name = "";
		address = "";
		city = "";
		state = "";
		zipCode = "";

	}

	/**
	 * Instantiates a new facility.
	 *
	 * @param fid the fid
	 * @param fname the fname
	 * @param faddr the faddr
	 * @param fcity the fcity
	 * @param fst the fst
	 * @param fzip the fzip
	 */
	public Facility(String fid, String fname, String faddr, String fcity, String fst, String fzip) {
		id = fid;
		name = fname;
		address = faddr;
		city = fcity;
		state = fst;
		zipCode = fzip;

	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {

		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param fid the new id
	 */
	public void setId(String fid) {
		this.id = fid;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param fname the new name
	 */
	public void setName(String fname) {
		this.name = fname;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param faddr the new address
	 */
	public void setAddress(String faddr) {
		this.address = faddr;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param fcity the new city
	 */
	public void setCity(String fcity) {
		this.city = fcity;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param fst the new state
	 */
	public void setState(String fst) {
		this.state = fst;
	}

	/**
	 * Gets the zip code.
	 *
	 * @return the zip code
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the zip code.
	 *
	 * @param fzip the new zip code
	 */
	public void setZipCode(String fzip) {
		this.zipCode = fzip;
	}

	/**
	 * Prints the.
	 *
	 * @param varName the var name
	 */
	public void print(String varName) {
		String printString = "Facilty:  " + "id: " + getId() + "name: " + getName() + "address: " + getAddress()
				+ "city: " + getCity() + "state: " + getState() + "zip: " + getZipCode();
		System.out.println(printString);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override

	public String toString() {
		String s = "Facilty:  " + "id: " + id + "name: " + name + "address: " + address + "city: " + city + "state: "
				+ state + "zip: " + zipCode;
		return s;
	}

}
