package com.bridgelabz.companysharesusingstack;


import com.bridgelabz.linkedlist.INode;

public class CompanysharesModel implements INode<Companyshares> 
{
	private Companyshares key;
	private CompanysharesModel next;
	
	public CompanysharesModel(Companyshares key) {
		super();
		this.key = key;
		this.next = null;
	}
	@Override
	public Companyshares getKey() {
		
		return this.key;
	}
	@Override
	public INode<Companyshares> getNext() {
		
		return this.next;
	}
	@Override
	public void setKey(Companyshares key) {
		this.key = key;
		
	}
	@Override
	public void setNext(INode<Companyshares> next) {
		this.next = (CompanysharesModel) next;	
	}
}