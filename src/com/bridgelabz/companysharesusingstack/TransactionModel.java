package com.bridgelabz.companysharesusingstack;
import com.bridgelabz.linkedlist.INode;
public class TransactionModel implements INode<Transactions> 
{
	private Transactions key;
	private TransactionModel next;
	
	public TransactionModel(Transactions key) {
		super();
		this.key = key;
		this.next = null;
	}
	@Override
	public Transactions getKey() {
		
		return this.key;
	}
	@Override
	public INode<Transactions> getNext() {
		return this.next;
	}
	@Override
	public void setKey(Transactions key) {
		this.key=key;
		
	}
	@Override
	public void setNext(INode<Transactions> next) {
		this.next = (TransactionModel) next;
	}
}