package com.tesco.rs.domain;

import com.tesco.rs.constant.Domain;

/**
 * @author vagrant
 *
 */
public class ProductLocation implements Domain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8203044947132762996L;

	private String id;
	private String productName;
	private String longitude;
	private String latitude;

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductLocation [id=" + id + ", productName=" + productName + ", longitude=" + longitude + ", latitude="
				+ latitude + "]";
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
