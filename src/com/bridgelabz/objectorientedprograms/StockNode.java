package com.bridgelabz.objectorientedprograms;
import com.bridgelabz.linkedlist.INode;
public class StockNode implements INode<Stock> {
	private Stock key;
	private StockNode next;
	
	public StockNode(Stock key) {
		super();
		this.key = key;
		this.next = null;
	}

	@Override
	public Stock getKey() {
		return this.key;
	}

	@Override
	public INode<Stock> getNext() {
		return this.next;
	}

	@Override
	public void setKey(Stock key) {
		this.key = key;
		
	}

	@Override
	public void setNext(INode<Stock> next) {
		this.next = (StockNode) next;
		
	}

}
