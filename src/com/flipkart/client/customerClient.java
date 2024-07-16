/**
 * 
 */
package com.flipkart.client;
import com.flipkart.business.customerBusinesss;

/**
 * 
 */
public class customerClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entry Point of the Application with Public static void main 
		
		customerBusinesss service =new customerBusinesss();
		service.createCustomer();
		System.out.println("delete Customer-->" +service.deleteCustomer(101));
		System.out.println("Update Customer-->" +service.updateCustomer(101));
		service.listCustomer();
		
	}	

}
