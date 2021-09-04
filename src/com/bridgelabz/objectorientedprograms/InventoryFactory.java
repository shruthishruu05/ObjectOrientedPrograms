package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.linkedlist.INode;

public class InventoryFactory implements INode<Inventory> {
	Inventory key;
	InventoryFactory next;
	public InventoryFactory(Inventory key) {
		super();
		this.key = key;
		this.next = null;
	}

	@Override
	public Inventory getKey() {
		return this.key;
	}

	@Override
	public INode<Inventory> getNext() {
		return this.next;
	}

	@Override
	public void setKey(Inventory key) {
		this.key = key;
	}

	@Override
	public void setNext(INode<Inventory> next) {
		this.next = (InventoryFactory) next;
	}

	

}
