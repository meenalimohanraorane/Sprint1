/**
 * This Interface is to Declare Services of Product Review like view, add and update
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
	/**
	 * This method will update the rating and feedback(review) for product with productID and review with reviewID
	 * @param productID
	 * @param reviewID
	 * @param newRating
	 * @param newFeedback
	 */
	public void updateReview(int productID, int reviewID, float newRating, String newFeedback);

}
