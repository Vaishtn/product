package com.xworkz.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")
public class ProductEntity {
	@Id
	@Column(name = "PID")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int pid;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRODUCT_TYPE")
	@Enumerated(EnumType.STRING)
	private ProductType type;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "QUANTITY")
	private int quanitity;
	@Column(name = "QUALITY")
	private boolean quality;
	@Column(name = "MANUFACTURE")
	private String manufacture;
	@Column(name = "BRAND")
	private String brand;

	public enum ProductType {
		HOME_APPLIANCES, ELECTRONIC, COMPUTERS, FASHION
	}

	public ProductEntity(String name, ProductType type, double price, int quanitity, boolean quality,
			String manufacture, String brand) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.quanitity = quanitity;
		this.quality = quality;
		this.manufacture = manufacture;
		this.brand = brand;
	}

}
