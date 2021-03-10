package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class VarshaTester {

	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		ProductEntity entity=dao.findByTypeAndQuality("Laptop", "Dell", true);
		System.out.println(entity);
	}

}
