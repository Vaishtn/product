package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class DistinctTester {

	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		ProductEntity entity=dao.findDistinct();
		System.out.println(entity);
		// TODO Auto-generated method stub

	}

}
