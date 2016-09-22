package com.tesco.rs.domain;

import java.util.List;

import com.tesco.rs.constant.Domain;

public class Product implements Domain {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6445600476116946037L;
	public String id;
	public String productName;
	public String productDescription;
	public String retailPrice;
	public String rating;
	public String manufacturingDate;
	public String expiryDate;
	public List<String> productReview;
	public String trackerImageName;
	
	public String getTrackerImageName() {
		return trackerImageName;
	}

	public void setTrackerImageName(String trackerImageName) {
		this.trackerImageName = trackerImageName;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public List<String> getProductReview() {
		return productReview;
	}

	public void setProductReview(List<String> productReview) {
		this.productReview = productReview;
	}

	public ProductLocation productLocation;

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}

	public ProductLocation getProductLocation() {
		return productLocation;
	}

	public void setProductLocation(ProductLocation productLocation) {
		this.productLocation = productLocation;
	}


	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
}
