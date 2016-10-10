package com.seed.beans;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//TODO:0	Modification required
public class ShoppingCart {
	private java.util.Collection<Integer> productIds;	

	public ShoppingCart() {
//		TODO:1 Create object of LinkedList,
//		which will be referred using member variable "productIds"
		productIds= new LinkedList<Integer>();
	}	
	
	public java.util.Set<Integer> getProductSet() {
//		TODO:2 return set of product ids stored in this shopping cart
		Set<Integer> productSet = new HashSet<Integer>();
		for(int value:productIds){
			productSet.add(value);
		}
		return productSet;
		
	}

	public void setProductList(String[] newProductIds) {
//		TODO:3	add newProductIds into existing list of product ids
		for (String id: newProductIds){
			int productID= Integer.parseInt(id);
			productIds.add(productID);
		}
	}	
}
