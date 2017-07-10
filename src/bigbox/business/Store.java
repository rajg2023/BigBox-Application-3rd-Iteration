package bigbox.business;

import java.text.NumberFormat;

/**
 * The Class Store.
 */
public class Store extends Facility {
	
	/** The store number. */
	private String storeNumber;
	
	/** The division number. */
	private String divisionNumber;
	
	/** The sales. */
	private double sales;

	/**
	 * Instantiates a new store.
	 *
	 * @param infID the inf ID
	 * @param dn the dn
	 * @param sn the sn
	 * @param s the s
	 * @param fname the fname
	 * @param faddr the faddr
	 * @param fcity the fcity
	 * @param fst the fst
	 * @param fzip the fzip
	 */
	public Store(String infID, String dn, String sn, double s, String fname, String faddr, String fcity, String fst,
			String fzip) {
		super(infID, fname, faddr, fcity, fst, fzip);
		storeNumber = sn;
		divisionNumber = dn;
		sales = s;

	}

	/**
	 * Gets the store number.
	 *
	 * @return the store number
	 */
	public String getStoreNumber() {
		return storeNumber;
	}

	/**
	 * Sets the store number.
	 *
	 * @param storeNumber the new store number
	 */
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	/**
	 * Gets the division number.
	 *
	 * @return the division number
	 */
	public String getDivisionNumber() {
		return divisionNumber;
	}

	/**
	 * Sets the division number.
	 *
	 * @param divisionNumber the new division number
	 */
	public void setDivisionNumber(String divisionNumber) {
		this.divisionNumber = divisionNumber;
	}

	/**
	 * Gets the sales.
	 *
	 * @return the sales
	 */
	public double getSales() {
		return sales;
	}

	/**
	 * Sets the sales.
	 *
	 * @param sales the new sales
	 */
	public void setSales(double sales) {
		this.sales = sales;
	}

	/**
	 * Gets the formatted sales.
	 *
	 * @return the formatted sales
	 */
	public String getFormattedSales() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(sales);
	}

	/* (non-Javadoc)
	 * @see bigbox.business.Facility#print(java.lang.String)
	 */
	public void print(String varName) {
		String printString = " Store Number:   " + getStoreNumber() + " Division Number:   " + getDivisionNumber()
				+ " Sales:   " + getFormattedSales();
		System.out.println(printString);
	}

	/* (non-Javadoc)
	 * @see bigbox.business.Facility#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Store Number:   " + storeNumber + " Division Number:   " + divisionNumber
				+ " Sales:   " + this.getFormattedSales();
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return 0;
	}

	/**
	 * Gets the.
	 *
	 * @param i the i
	 * @return the store
	 */
	public Store get(int i) {
		return null;
	}

}
