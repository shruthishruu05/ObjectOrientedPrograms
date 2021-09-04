package com.bridgelabz.objectorientedprograms;

public class Stock {
	private String name;
	private long numberOfShares;
	private double price;
	private double cost;
	public Stock(String name, long numberOfShares, double price) {
		super();
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.price = price;
	}
	public double getCost() {
		return cost;
	}
	public void setCost() {
		this.cost = numberOfShares * price;
	}
	public String getName() {
		return name;
	}
	public long getNumberOfShares() {
		return numberOfShares;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumberOfShares(long numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [name=" + name + ", numberOfShares=" + numberOfShares + ", price=" + price +", cost="+cost + "]";
	}
	
	
}
