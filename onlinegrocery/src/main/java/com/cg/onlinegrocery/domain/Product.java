/**
 * 
 * This Product Class will Store all the Details of the Product 
 * @author Meenali M. Rane
 * 
 */
package com.cg.onlinegrocery.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "product_id")
	private int productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_amount")
	private double productAmount;
	@Column(name = "product_description")
	private String productDescription;
	
	@OneToMany (mappedBy = "product")
	private List<Review> reviews = new ArrayList<Review>();

	//Generate Getters and setters
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(Double productAmount) {
		this.productAmount = productAmount;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String description) {
		this.productDescription = description;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}