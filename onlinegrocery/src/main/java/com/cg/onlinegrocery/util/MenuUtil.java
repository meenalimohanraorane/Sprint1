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
		int choice;
		String continueChoice;
		
		do {
			System.out.println("\n-------MENU-------");
			System.out.println("1. Add Review");
			System.out.println("2. View Reviews");
			System.out.println("3. Update Review");
			System.out.println("0. Exit");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter Product Id : ");
					int prodId = sc.nextInt();
					System.out.print("Enter Review Number : ");
					int reviewId = sc.nextInt();
					System.out.print("Enter Rating Upto 10 : ");
					float rating = sc.nextFloat();
					System.out.print("Enter Feedback : ");		
					String feedback = sc.next();
					
					ProductReviewServiceImpl addRecord = new ProductReviewServiceImpl();
					addRecord.addReview(prodId, reviewId, rating, feedback);
					break;
						
				case 2:
					System.out.print("Enter Product Id To See Reviews : ");
					int productId = sc.nextInt();
					ProductReviewServiceImpl viewRecord = new ProductReviewServiceImpl();
					viewRecord.viewReview(productId);
					break;
				
				case 3:
					System.out.print("Enter Product Id : ");
					int productID = sc.nextInt();
					System.out.print("Enter Review Number : ");
					int reviewID = sc.nextInt();
					System.out.print("Enter Rating Upto 10 : ");
					float newRating = sc.nextFloat();
					System.out.print("Enter Feedback : ");		
					String newFeedback = sc.next();
					
					ProductReviewServiceImpl updateRecord = new ProductReviewServiceImpl();
					updateRecord.updateReview(productID, reviewID, newRating, newFeedback);
					break;
					
				case 0:
					System.out.println("Exiting...");
					System.exit(0);
					break;
				
				default:
					System.out.println("Invalid Choice!");
			}
			
			System.out.print("Do You Want To Continue? [yes/no] : ");
			continueChoice = sc.next();
			
		} while (continueChoice.equalsIgnoreCase("yes"));
		sc.close();
	}	
}