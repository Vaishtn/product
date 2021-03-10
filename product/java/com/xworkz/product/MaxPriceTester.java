package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class MaxPriceTester {
	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		double entity=dao.findMaxPrice();
		System.out.println(entity);
	}

}
