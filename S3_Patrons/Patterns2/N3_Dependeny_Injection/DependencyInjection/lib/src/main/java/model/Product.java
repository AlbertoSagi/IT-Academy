package model;

import Services.IConverter;

public class Product {

	private String name;
	private double price;
	private IConverter converter;
	private String simbol = "€";

	public Product() {

	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

//	public Product(String name, double price, IConverter converter) {
//		this.name = name;
//		this.price = price;
//		this.converter = converter;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSimbol() {
		return simbol;
	}

	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}

	public IConverter getConverter() {
		return converter;
	}

	public void setConverter(IConverter converter) {
		this.converter = converter;
	}

	@Override
	public String toString() {
		return name + " " + price + simbol;
	}

}
