package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class MaxIdTester {
	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		int entity=dao.findMaxId();
		System.out.println(entity);
		
	}
;
}
