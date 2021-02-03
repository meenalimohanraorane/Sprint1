/**
 * This Class is for Handling the Review Not Found Exception
* @author Meenali M. Rane
*/
package com.cg.onlinegrocery.serviceimpl;

public class ReviewNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ReviewNotFoundException() {
		super();
	}
	
	public ReviewNotFoundException(String errorMessage) {
		super(errorMessage);
	}

}
