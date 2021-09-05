package com.bridgelabz.companysharesusingstack;

public class Companyshares {

	private String company_symbol;
	private String company_name;
	private int company_shares;
	private int company_share_price;
	private int company_total_value;

	public Companyshares(String companySymbol, String company_name, int company_shares, int company_share_price,
			int company_total_value) 
	{
		super();
		this.company_symbol = companySymbol;
		this.company_name = company_name;
		this.company_shares = company_shares;
		this.company_share_price = company_share_price;
		this.company_total_value = company_total_value;
	}
	@Override
	public String toString() {
		return "Companyshares [company_symbol=" + company_symbol + ", company_name=" + company_name
				+ ", company_shares=" + company_shares + ", company_share_price=" + company_share_price
				+ ", company_total_value=" + company_total_value + "]";
	}

	public String getCompany_symbol() {
		return company_symbol;
	}

	public void setCompany_symbol(String company_symbol) {
		this.company_symbol = company_symbol;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public int getCompany_shares() {
		return company_shares;
	}

	public void setCompany_shares(int company_shares) {
		this.company_shares = company_shares;
	}

	public int getCompany_share_price() {
		return company_share_price;
	}

	public void setCompany_share_price(int company_share_price) {
		this.company_share_price = company_share_price;
	}

	public int getCompany_total_value() {
		return company_total_value;
	}

	public void setCompany_total_value(int company_total_value) {
		this.company_total_value = company_total_value;
	}

}