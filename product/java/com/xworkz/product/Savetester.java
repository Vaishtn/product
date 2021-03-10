package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class Savetester {

	public static void main(String[] args) {
		ProductEntity entity=new ProductEntity("Fan", ProductType.ELECTRONIC,700 , 4, true, "Usha", "USHA");
		ProductEntity entity1=new ProductEntity("WashingMachine", ProductType.HOME_APPLIANCES,350000, 6, true, "Sony", "Sony");
		
		ProductDAO dao=new ProductDAOImpl();
		dao.persist(entity);
		dao.persist(entity1);

	}

}
