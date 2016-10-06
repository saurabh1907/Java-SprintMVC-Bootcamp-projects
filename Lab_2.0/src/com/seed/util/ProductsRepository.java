package com.seed.util;

import java.util.Map;

import com.seed.beans.Product;

// TODO:0	Don't modify this resource
public interface ProductsRepository {
	
//	This method should return map of entries.
//	Each entry has product id as a key and product details as value. 
	Map<Integer,Product> getProductEntries();
}
