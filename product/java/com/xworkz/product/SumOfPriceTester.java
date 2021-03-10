package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class SumOfPriceTester {
	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		double entity=dao.findSumOfPrice();
		System.out.println(entity);
	}

}
