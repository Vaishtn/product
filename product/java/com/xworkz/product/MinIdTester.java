package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class MinIdTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao=new ProductDAOImpl();
		Integer entity=dao.findMinId();
		System.out.println(entity);

	}

}
