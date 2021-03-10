package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class OmTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao=new ProductDAOImpl();
		Double entity=dao.findPriceByTypeAndBrandAndName("Laptop", "Dell", ProductType.COMPUTERS);
		System.out.println(entity);
	}

}
