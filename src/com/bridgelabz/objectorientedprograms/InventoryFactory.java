package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

import com.bridgelabz.linkedlist.LinkedList;

public class InventoryFactory {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Inventory> inventoryList = new LinkedList<Inventory>();
		public LinkedList add()
		{
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
				InventoryNode iFactory = new InventoryNode(inventory);
				inventoryList.add(iFactory);
			}
			return inventoryList;
		}
	}

