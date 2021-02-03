/**
 * This Class has the Menu for Product Review related Services
 * @author Meenali M. Rane
 */
package com.cg.onlinegrocery.util;

import java.util.Scanner;

import com.cg.onlinegrocery.serviceimpl.ProductReviewServiceImpl;

public class MenuUtil {

	public MenuUtil() {
	}
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1. Add Review");
		System.out.println("2. View Reviws");
		System.out.println("0. Exit");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter Product Id : ");
				int prodId = sc.nextInt();
				System.out.println("Enter Review Number : ");
				int reviewId = sc.nextInt();
				System.out.println("Enter Rating Upto 10 : ");
				float rating = sc.nextFloat();
				System.out.println("Enter Feedback : ");		
				String feedback = sc.next();
				
				ProductReviewServiceImpl addRecord = new ProductReviewServiceImpl();
				addRecord.addReview(prodId, reviewId, rating, feedback);
				break;
					
			case 2:
				System.out.println("Enter Product Id To See Reviews : ");
				int productId = sc.nextInt();
				ProductReviewServiceImpl viewRecord = new ProductReviewServiceImpl();
				viewRecord.viewReview(productId);
				break;
				
			case 0:
				System.out.println("Exiting...");
				break;
			
			default:
				System.out.println("Invalid Choice!");
		}
		
		sc.close();
	}
	
}
