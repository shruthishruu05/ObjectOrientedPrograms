package com.bridgelabz.companyshares;

public class Customerinfo 
{
	private String customer_symbol;
	private String customer_name;
	private int customer_shares;
	private int customer_balance;

	public Customerinfo(String customer_symbol, String customer_name, int customer_shares,int customer_balance)
	{
		super();
		this.customer_symbol = customer_symbol;
		this.customer_name = customer_name;
		this.customer_shares = customer_shares;
		this.customer_balance = customer_balance;
	}
	
	@Override
	public String toString() {
		return "Customerinfo [customer_symbol=" + customer_symbol + ", customer_name=" + customer_name
				+ ", customer_shares=" + customer_shares + ", customer_balance=" + customer_balance + "]";
	}

	public int getCustomer_balance() {
		return customer_balance;
	}

	public void setCustomer_balance(int customer_balance) {
		this.customer_balance = customer_balance;
	}

	public String getCustomer_symbol() {
		return customer_symbol;
	}

	public void setCustomer_symbol(String customer_symbol) {
		this.customer_symbol = customer_symbol;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getCustomer_shares() {
		return customer_shares;
	}

	public void setCustomer_shares(int customer_shares) {
		this.customer_shares = customer_shares;
	}
}