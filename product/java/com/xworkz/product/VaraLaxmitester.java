package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class VaraLaxmitester {

	public static void main(String[] args) {
		ProductDAO dao=new ProductDAOImpl();
		Object[] obj=dao.findPriceAndQuantityByTypeAndBrandAndName("Laptop", "Dell", ProductType.COMPUTERS);
		System.out.println(obj);
		System.out.println(obj[0]);
		System.out.println(obj[1]);
	}

}
