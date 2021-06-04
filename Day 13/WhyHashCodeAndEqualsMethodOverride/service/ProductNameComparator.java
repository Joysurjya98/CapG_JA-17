package com.capgemini.hashcodeandequalsmethod.service;

import java.util.Comparator;
import com.capgemini.hashcodeandequalsmethod.model.Product;

public class ProductNameComparator implements Comparator<Product> {
	
	@Override
	public int compare(Product product1, Product product2) {
		return product1.getPname().compareTo(product2.getPname());
	}
	
}
