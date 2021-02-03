/**
 * This Interface is to Declare Services of Product Review like view, add
 * @author Meenali M. Rane
 *
 */
package com.cg.onlinegrocery.service;

public interface ProductReviewService{
	/**
	 * This method should add the rating and feedback(review) for the product with productID
	 * @param prodId
	 * @param reviewId
	 * @param rating
	 * @param feedback
	 */
	public void addReview(int prodId, int reviewId, float rating, String feedback);
	
	/**
	 * This method should return the reviews of the product with productID
	 * @param productId
	 */
	public void viewReview(int productId);

}
