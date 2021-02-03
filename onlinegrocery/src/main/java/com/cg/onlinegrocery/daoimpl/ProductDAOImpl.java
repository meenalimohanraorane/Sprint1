package com.cg.onlinegrocery.daoimpl;

public class ProductDAOImpl // extends DBUtils implements ProductDAO 
{

//	DBUtils dbutil;
//	EntityManager entitymanager;
//	public ProductDAOImpl() {
//		dbutil=new DBUtils();
//	}
//
//	
//	@Override
//	public void addProduct(Product product) {
////		product.setProductName("facewash");
////		product.setDescription("used to clean face");
////		product.setPrice(100.00);
////		product.setProductAmount(1);
//		entitymanager=dbutil.createEntityManager();
//		entitymanager.getTransaction().begin();
//		entitymanager.persist(product);
//		entitymanager.getTransaction().commit();
//
//	}
//
//	@Override
//	public void removeProduct(int productId, String productName) {
//		/**
//		 * This removeProduct method will remove product from products table in
//		 * database 
//		 */
//		entitymanager=dbutil.createEntityManager();
//		entitymanager.getTransaction().begin();
//		Product product = entitymanager.find(Product.class, productId);
//		entitymanager.remove(product);
//		entitymanager.getTransaction().commit();
//		entitymanager.close();
//	}
//
//
//	@Override
//	public void updateProduct(Product product1, int productId) {
//
//		    entitymanager=dbutil.createEntityManager();
//			entitymanager.getTransaction().begin();		
//			Product product = entitymanager.find(Product.class, productId);
//			product.setProductName(product1.getProductName());
//			product.setProductAmount(product1.getProductAmount());
//			product.setPrice(product1.getPrice());
//			product.setDescription(product1.getDescription());
//			entitymanager.getTransaction().commit();
//	}
//
//	@Override
//	public void searchProduct(String productName, int productId) {
//		entitymanager=dbutil.createEntityManager();
//		entitymanager.getTransaction().begin();	
//		Product product = entitymanager.find(Product.class, productId);
//		System.out.println("Product Id: "+ product.getProductId());
//		System.out.println("Product Name: "+ product.getProductName());
//		System.out.println("Product Description: "+ product.getDescription());
//		System.out.println("Product Price: "+ product.getPrice());
//		System.out.println("Product Amount: "+ product.getProductAmount());
//		}
//
//	/**
//	 * This findAll method will list all product details 
//	 */	
//	@Override
//	public List<Product> findAllProducts() {
//		entitymanager=dbutil.createEntityManager();
//		Query query =entitymanager.createQuery("from Product");	
//		
//		entitymanager.getTransaction().begin();	
//		List<Product> products =  query.getResultList();
//		for(Product product:products)
//		{
//			System.out.println("Product Id: "+ product.getProductId());
//			System.out.println("Product Name: "+ product.getProductName());
//			System.out.println("Product Description: "+ product.getDescription());
//			System.out.println("Product Price: "+ product.getPrice());
//			System.out.println("Product Amount: "+ product.getProductAmount());
//			System.out.println("-----------------------------");
//	}
//		
//		return null;
//	}
}
