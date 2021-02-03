/**
 * This Class is for Handling Invalid Rating Exception
* @author Meenali M. Rane
*/
package com.cg.onlinegrocery.exception;

public class InvalidRatingException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidRatingException() {
		super();
	}

	public InvalidRatingException(String errorMessage) {
		super(errorMessage);
	}

}
