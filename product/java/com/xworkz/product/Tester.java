package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		ProductEntity entity=dao.findByNameAndManufacture("Fan", "Usha");
		
		System.out.println(entity);

	}

}
