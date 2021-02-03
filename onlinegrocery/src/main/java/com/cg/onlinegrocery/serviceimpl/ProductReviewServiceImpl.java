/**
 * This Class is to Implement Services of Product Review like view, add
 * @author Meenali M. Rane
 *
 */
package com.cg.onlinegrocery.serviceimpl;

import java.util.List;

import javax.persistence.EntityManager;

import com.cg.onlinegrocery.domain.Product;
import com.cg.onlinegrocery.domain.Review;
import com.cg.onlinegrocery.exception.InvalidRatingException;
import com.cg.onlinegrocery.exception.ProductNotFoundException;
import com.cg.onlinegrocery.service.ProductReviewService;
import com.cg.onlinegrocery.util.DBUtils;

public class ProductReviewServiceImpl extends Review implements ProductReviewService{
	
	public ProductReviewServiceImpl() {
	}
	
	public void addReview(int prodId, int reviewId, float rating, String feedback) {
		try {	
			
			if(rating < 0 || rating > 10) {
				throw new InvalidRatingException("Rating should lie in the range 0-10");
			}
			
			DBUtils dbUtil = new DBUtils();
			EntityManager entityManager = dbUtil.createEntityManager();	
			entityManager.getTransaction().begin();
			
			Product product = entityManager.find(Product.class, prodId);
			if(product == null) {
				throw new ProductNotFoundException("No Such Product Exists");
			}
			
			Review review = new Review();
			review.setReviewId(reviewId);
			review.setRating(rating);
			review.setFeedback(feedback);
			
			product.getReviews().add(review);
			review.setProduct(product);

			entityManager.persist(product);
			entityManager.persist(review);
			entityManager.getTransaction().commit();
			
			System.out.println("Review for Product with Product Id "+prodId+" has been Added");
			entityManager.close();
		
		}
		catch(InvalidRatingException errorMessage) {
			System.out.println(errorMessage.getMessage());
		}
		catch(ProductNotFoundException errorMessage) {
			System.out.println(errorMessage.getMessage());
		}
		
	}

	public void viewReview(int productId) {
		try {

			DBUtils dbUtil = new DBUtils();
			EntityManager entityManager = dbUtil.createEntityManager();
			entityManager.getTransaction().begin();
			
			Product product = entityManager.find(Product.class, productId);
			if(product == null) {
				throw new ProductNotFoundException("No Such Product Exists");
			}
			
			System.out.println("Reviews for Product with ID "+productId+" are : ");
			List<Review> reviews = product.getReviews();
			for (Review review : reviews) {
				System.out.println("Rating : "+review.getRating());
				System.out.println("Feedback : "+review.getFeedback());
				System.out.println("-------------------------");
			}
			
			entityManager.getTransaction().commit();
			entityManager.close();
		}
		catch(ProductNotFoundException errorMessage) {
			System.out.println(errorMessage.getMessage());
		}
	}
}
