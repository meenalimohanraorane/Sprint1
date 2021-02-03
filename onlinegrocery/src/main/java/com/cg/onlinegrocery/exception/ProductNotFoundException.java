/**
 * This Class is for Handling the Product Not Found Exception
* @author Meenali M. Rane
*/
package com.cg.onlinegrocery.exception;

public class ProductNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ProductNotFoundException() {
		super();
	}
	
	public ProductNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
