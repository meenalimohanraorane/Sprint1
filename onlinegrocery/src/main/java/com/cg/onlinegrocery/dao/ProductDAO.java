package com.cg.onlinegrocery.dao;

import java.util.List;
import com.cg.onlinegrocery.domain.Product;

public interface ProductDAO {

	/**
	 * This addProduct method will save the product object in products table
	 * @param product object to be saved
	 */
	void addProduct(Product product);
	
	/**		
	 * This removeProduct method will delete the  product object from products table
	 * @param product to be deleted
	 */
	void removeProduct(int productId, String productName);
	/**
	 * This delete method will delete the product based on id from products table
	 * @param id of the product to be deleted
	 */
	 
	void updateProduct(Product product1, int productId);
	/**
	 * This findAll method will return the list of users if found 
	 * @return list of products if found otherwise null
	 */
	
	void searchProduct(String productName, int productId);
	/**
	 * This findAll method will return the list of users if found 
	 * @return list of products if found otherwise null
	 */
	List<Product> findAllProducts();
}
