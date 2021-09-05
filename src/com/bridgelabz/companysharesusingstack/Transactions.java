package com.bridgelabz.companysharesusingstack;

public class Transactions 
{
	private String transaction_id;
	private String buyer;
	private String seller;
	private int transaction_amount;
	private String datetime;
	
	public Transactions() {
		
	}
	public Transactions(String transaction_id, String buyer, String seller, int transaction_amount, String datetime) {
		super();
		this.transaction_id = transaction_id;
		this.buyer = buyer;
		this.seller = seller;
		this.transaction_amount = transaction_amount;
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "Transactions [transaction_id=" + transaction_id + ", buyer=" + buyer + ", seller=" + seller
				+ ", transaction_amount=" + transaction_amount + ", datetime=" + datetime + "]";
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public int getTransaction_amount() {
		return transaction_amount;
	}

	public void setTransaction_amount(int transaction_amount) {
		this.transaction_amount = transaction_amount;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}