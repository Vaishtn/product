package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class IdTester {

	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		Object[] entity=dao.findNameAndTypeById(3);
		System.out.println(entity);
		System.out.println(entity[0]);
		System.out.println(entity[1]);

	}

}
