package com.bridgelabz.objectorientedprograms;

public class Inventory {
	private String name;
	private double weight;
	private double price;
	private double cost;
	
	public Inventory(String name, double weight, double price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public double getPrice() {
		return price;
	}
	public double getCost() {
		return cost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCost() {
		this.cost = this.weight*this.price;
	}
	@Override
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", price=" + price + ", cost=" + cost + "]";
	}
	
	
}
