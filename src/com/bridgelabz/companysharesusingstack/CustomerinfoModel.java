package com.bridgelabz.companysharesusingstack;

import com.bridgelabz.linkedlist.INode;

public class CustomerinfoModel implements INode<Customerinfo> {
	private Customerinfo key;
	private CustomerinfoModel next;
	
	
	public CustomerinfoModel(Customerinfo key) 
	{
		super();
		this.key = key;
		this.next = null;
	}
	@Override
	public Customerinfo getKey() {
		return this.key;
	}
	@Override
	public INode<Customerinfo> getNext() {
		return this.next;
	}
	@Override
	public void setKey(Customerinfo key) {
		this.key=key;
	}
	@Override
	public void setNext(INode<Customerinfo> next) {
		this.next = (CustomerinfoModel) next;
		
	}

}