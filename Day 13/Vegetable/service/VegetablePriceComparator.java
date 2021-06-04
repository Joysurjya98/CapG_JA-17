package com.capgemini.vegetable.service;

import java.util.Comparator;
import com.capgemini.vegetable.model.*;

public class VegetablePriceComparator implements Comparator<Vegetable> {
	
	@Override
	public int compare(Vegetable v1, Vegetable v2) {
		// TODO Auto-generated method stub
		if(v1.getVegPrice()==v2.getVegPrice())
			return 0;
		if(v1.getVegPrice()>v2.getVegPrice())
			return 1;
		return -1;
	}


}
