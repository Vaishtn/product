package com.xworkz.product.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;
import com.xworkz.util.sfUtil.SFUtil;

public class ProductDAOImpl implements ProductDAO {
	private SessionFactory factory = SFUtil.getFactory();

	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void persist(ProductEntity entity) {
		System.out.println("create method");
		System.out.println("entity" + entity);
		Session session = factory.openSession();
		System.out.println("started op");
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		System.out.println("data is saved");

	}

	@Override
	public ProductEntity findByNameAndManufacture(String name, String manu) {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select product from ProductEntity product where name=:nm and manufacture=:man";
			Query<ProductEntity> query = session.createQuery(hqlSyntax);
			query.setParameter("nm", name);
			query.setParameter("man", manu);
			ProductEntity entity = query.uniqueResult();

			return entity;
		}

	}

	@Override
	public ProductEntity findByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select product from ProductEntity product where name=:nm and brand=:brand and type=:tp";
			Query<ProductEntity> query = session.createQuery(hqlSyntax);
			query.setParameter("nm", name);
			query.setParameter("brand", brand);
			query.setParameter("tp", type);
			ProductEntity entity = query.uniqueResult();

			return entity;
		}

	}

	@Override
	public Double findPriceByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select product.price from ProductEntity product where brand=:brand and type=:tp and name=:nm ";
			Query<Double> query = session.createQuery(hqlSyntax);
			query.setParameter("brand", brand);
			query.setParameter("tp", type);
			query.setParameter("nm", name);
			Double entity1 = query.uniqueResult();
			return entity1;
		}

	}

	@Override
	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select product.price,product.quanitity from ProductEntity product where  brand=:brand and type=:tp and name=:nm ";
			Query<Object[]> query = session.createQuery(hqlSyntax);
			query.setParameter("brand", brand);
			query.setParameter("tp", type);
			query.setParameter("nm", name);
			Object[] obj = query.uniqueResult();
			return obj;

		}
	}

	@Override
	public ProductEntity findByTypeAndQuality(String name, String brand, boolean quality) {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select product from ProductEntity product where brand=:brand and quality=:qt and name=:nm";
			Query<ProductEntity> query = session.createQuery(hqlSyntax);
			query.setParameter("brand", brand);
			query.setParameter("qt", quality);
			query.setParameter("nm", name);
			ProductEntity entity = query.uniqueResult();
			return entity;

		}

	}

	@Override
	public Object[] findNameAndTypeById(int id) {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select product.name,product.type from ProductEntity product where id=:id";
			Query<Object[]> query = session.createQuery(hqlSyntax);
			query.setParameter("id", id);
			Object[] obj = query.uniqueResult();
			return obj;

		}

	}

	@Override
	public int findMaxId() {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select max(pid) from ProductEntity";
			Query<Integer> query = session.createQuery(hqlSyntax);

			int max = query.uniqueResult();

			return max;

		}

	}

	@Override
	public long findSize() {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select count(*) from ProductEntity ";
			Query<Long> query = session.createQuery(hqlSyntax);
			Long size = query.uniqueResult();

			return size;

		}
		// TODO Auto-generated method stub

	}

	@Override
	public double findMaxPrice() {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select max(price) from ProductEntity";
			Query<Double> query = session.createQuery(hqlSyntax);

			Double max = query.uniqueResult();

			return max;

		}
		// TODO Auto-generated method stub

	}

	@Override
	public double findSumOfPrice() {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select sum(price) from ProductEntity";
			Query<Double> query = session.createQuery(hqlSyntax);

			Double max = query.uniqueResult();

			return max;

		}

		// TODO Auto-generated method stub

	}

	@Override
	public Integer findMinId() {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select min(pid) from ProductEntity";
			Query<Integer> query = session.createQuery(hqlSyntax);

			Integer intg = query.uniqueResult();

			return intg;

		}

		// TODO Auto-generated method stub

	}

	@Override
	public ProductEntity findDistinct() {
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select distinct(product) from ProductEntity product ";
			Query<ProductEntity> query = session.createQuery(hqlSyntax);
			ProductEntity entity = query.uniqueResult();
			return entity;
		}
		// TODO Auto-generated method stub

	}

}
