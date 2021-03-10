package com.xworkz.product.dao;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public interface ProductDAO {
	public void persist(ProductEntity entity);

	public ProductEntity findByNameAndManufacture(String name, String manu);

	public ProductEntity findByTypeAndBrandAndName(String name, String brand, ProductType type);

	public Double findPriceByTypeAndBrandAndName(String name, String brand, ProductType type);

	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name, String brand, ProductType type);

	public ProductEntity findByTypeAndQuality(String name, String brand, boolean quality);

	public Object[] findNameAndTypeById(int id);

	public int findMaxId();

	public long findSize();

	public double findMaxPrice();

	public double findSumOfPrice();

	public Integer findMinId();

	public ProductEntity findDistinct();

}
