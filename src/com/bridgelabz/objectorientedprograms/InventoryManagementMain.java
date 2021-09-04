package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

import com.bridgelabz.linkedlist.LinkedList;

public class InventoryManagementMain {
	public static void main(String[] args) {
		LinkedList<Inventory> inventoryList = new LinkedList<Inventory>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the details of inventory");
		for(int index =0;index<3;index++)
		{
			System.out.println("Enter inventory name");
			String name = scanner.next();
			System.out.println("Enter inventory weight");
			double weight = scanner.nextDouble();
			System.out.println("Enter inventory price");
			double price = scanner.nextDouble();
			Inventory inventory = new Inventory(name, weight, price);
			inventory.setCost();
			InventoryFactory iFactory = new InventoryFactory(inventory);
			inventoryList.add(iFactory);
		}
		inventoryList.display();
		scanner.close();
	}
}
