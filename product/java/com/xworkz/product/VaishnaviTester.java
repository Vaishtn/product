package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class VaishnaviTester {

	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		ProductEntity entity=dao.findByTypeAndBrandAndName("Fan", "usha", ProductType.ELECTRONIC);
		System.out.println(entity);
	}

}
