package com.bridgelabz.objectorientedprograms;

import java.util.Iterator;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;

public class InventoryManager {
	LinkedList<Inventory> inventoryList =new LinkedList<Inventory>();
	double total = 0;
	public double calculateTotal()
	{
		InventoryFactory inventoryObject = new InventoryFactory();
		inventoryList = inventoryObject.add();
		System.out.println("Cost of Each Inventry ");
		
		INode<Inventory> tempNode = inventoryList.head;
		while(tempNode != null) {
			System.out.println(tempNode.getKey().getName()+" : "+tempNode.getKey().getCost());
			tempNode = tempNode.getNext();
		}
		return total;	
	}
	
}
