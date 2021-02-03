/**
 * This Class provides JPA Connection to the Database
 * @author Meenali M. Rane
 *
 */

package com.cg.onlinegrocery.util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtils {

	public EntityManager createEntityManager()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
}