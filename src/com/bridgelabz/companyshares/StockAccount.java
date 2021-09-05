package com.bridgelabz.companyshares;

import java.util.Scanner;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class StockAccount {
	
	public static Scanner scanner = new Scanner(System.in);
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HHmmss");
	
	public void buy(LinkedList<Companyshares> listOfCompanies,INode<Customerinfo> tempNode
			,LinkedList<Transactions> transList) {
		System.out.println("****************buy***************");
		System.out.println("Please enter company symbol: ");
		String companySymbol = scanner.next();
		System.out.println("Validating...");
		boolean isCompanyFound = false;
		INode<Companyshares> tempCompanyNode = listOfCompanies.head;
		while(tempCompanyNode != null) {
			if(tempCompanyNode.getKey().getCompany_symbol().equals(companySymbol)) {
				isCompanyFound =true;
				break;
			}
			else
				isCompanyFound = false;
			tempCompanyNode = tempCompanyNode.getNext();
		}
		if (isCompanyFound) 
		{
			System.out.println("The company you selected is "+tempCompanyNode.getKey().getCompany_name());
			System.out.println("Company shares: " + tempCompanyNode.getKey().getCompany_shares());
			System.out.println("Company share price: " + tempCompanyNode.getKey().getCompany_share_price());
			System.out.println("Customer Balance :" +tempNode.getKey().getCustomer_balance());
			int customerBalance = tempNode.getKey().getCustomer_balance();
			Integer comShares = tempCompanyNode.getKey().getCompany_shares();
			
			System.out.println("Please enter how much shares to buy:");
			int numOfCompanyShareToBuy = scanner.nextInt();
			if (numOfCompanyShareToBuy <= comShares) {
				if (customerBalance > (numOfCompanyShareToBuy * tempCompanyNode.getKey().getCompany_shares())) 
				{
					int newCustomerBalance = customerBalance - numOfCompanyShareToBuy * tempCompanyNode.getKey().getCompany_share_price();
					tempNode.getKey().setCustomer_balance(newCustomerBalance);
					tempNode.getKey().setCustomer_shares(tempNode.getKey().getCustomer_shares()+numOfCompanyShareToBuy);
					tempCompanyNode.getKey().setCompany_total_value(tempCompanyNode.getKey().getCompany_share_price()*tempCompanyNode.getKey().getCompany_shares());
					Transactions trans = new Transactions();
					LocalDateTime now = LocalDateTime.now();
					String transId = dateTimeFormatter2.format(now)+tempNode.getKey().getCustomer_symbol()+ tempCompanyNode.getKey().getCompany_symbol();
					trans.setTransaction_id(transId);
					trans.setBuyer(tempNode.getKey().getCustomer_name());
					trans.setSeller(tempCompanyNode.getKey().getCompany_name());
					trans.setTransaction_amount(numOfCompanyShareToBuy * tempCompanyNode.getKey().getCompany_share_price());
					trans.setDatetime(dateTimeFormatter.format(now));
					TransactionModel transactionModel = new TransactionModel(trans);
					transList.append(transactionModel);
					System.out.println("Shares bought successfully");
					
				}
			else {
				System.out.println("Customer don't have that much balance");
			}
		}
			else {
			System.out.println("Company don't have that much shares");
		}
		}
		else {
			System.out.println("The company not found");
		}
	}

	public void sell(LinkedList<Companyshares> listOfCompanies,INode<Customerinfo> tempNode
			,LinkedList<Transactions> transList) {
		System.out.println("****************sell***************");
		System.out.println("Enter number of share you want to sell: ");
		int share = scanner.nextInt();
		System.out.println("Validating...");
		System.out.println("Please enter company symbol you want to sell: ");
		String companySymbol = scanner.next();
		boolean isCompanyFound = false;
		INode<Companyshares> tempCompanyNode = listOfCompanies.head;
		while(tempCompanyNode != null) {
			if(tempCompanyNode.getKey().getCompany_symbol().equals(companySymbol)) {
				isCompanyFound =true;
				break;
			}
			else
				isCompanyFound = false;
			tempCompanyNode = tempCompanyNode.getNext();
		}
		if (isCompanyFound) 
		{
			System.out.println("The company you selected is "+tempCompanyNode.getKey().getCompany_name());
			System.out.println("Company shares: " + tempCompanyNode.getKey().getCompany_shares());
			System.out.println("Company share price: " + tempCompanyNode.getKey().getCompany_share_price());
			int amountToGet = share * tempCompanyNode.getKey().getCompany_shares();
			System.out.println("Amount you will get: " + amountToGet);
			
			int  custShare = tempNode.getKey().getCustomer_shares();
			
			
			if (share  <= custShare) {
				tempCompanyNode.getKey().setCompany_share_price(tempCompanyNode.getKey().getCompany_shares()+share);
				tempCompanyNode.getKey().setCompany_total_value(tempCompanyNode.getKey().getCompany_share_price()*tempCompanyNode.getKey().getCompany_shares());
				
				tempNode.getKey().setCustomer_shares(tempNode.getKey().getCustomer_shares()+share);
				tempNode.getKey().setCustomer_balance(tempNode.getKey().getCustomer_balance()+amountToGet);
				
				Transactions trans = new Transactions();
				LocalDateTime now = LocalDateTime.now();
				String transId = dateTimeFormatter2.format(now)+tempNode.getKey().getCustomer_symbol()+ tempCompanyNode.getKey().getCompany_symbol();
				trans.setTransaction_id(transId);
				trans.setBuyer(tempCompanyNode.getKey().getCompany_name());
				trans.setSeller(tempNode.getKey().getCustomer_name());
				trans.setTransaction_amount(share * tempCompanyNode.getKey().getCompany_share_price());
				trans.setDatetime(dateTimeFormatter.format(now));
				
				TransactionModel transactionModel = new TransactionModel(trans);
				transList.append(transactionModel);
				System.out.println("Shares sold successfully");
				
				
		}
			else {
			System.out.println("You dont have that much shares to sell");
		}
		}
		else {
			System.out.println("The company not found");
		}
		
	}

	public void printReport(INode<Customerinfo> tempNode,LinkedList<Transactions> transList) {
		System.out.println("****************report***************");
		System.out.println();
		System.out.println();
		boolean hasValue = false;
		
		INode<Transactions> temptransNode = transList.head;
		
		while(temptransNode != null) {
			if(temptransNode.getKey().getBuyer().equals(tempNode.getKey().getCustomer_name()) 
					|| temptransNode.getKey().getSeller().equals(tempNode.getKey().getCustomer_name()) )
			{
				hasValue =true;
				break;
			}
				
			else
				hasValue = false;
			temptransNode = temptransNode.getNext();
		}
		if (hasValue) 
		{
			System.out.print("Transaction_ID\t");
			System.out.print("Buyer\t\t");
			System.out.print("Seller\t\t\t");
			System.out.print("Trans_Amt\t");
			System.out.println("DateTime\t");
			temptransNode = transList.head;
			while(temptransNode != null) {
				System.out.print(temptransNode.getKey().getTransaction_id()+"\t");
				System.out.print(temptransNode.getKey().getBuyer()+"\t\t");
				System.out.print(temptransNode.getKey().getSeller()+"\t\t\t");
				System.out.print(temptransNode.getKey().getTransaction_amount()+"\t");
				System.out.println(temptransNode.getKey().getDatetime()+"\t");
				if(temptransNode.getNext()!=null)
					temptransNode = temptransNode.getNext();
				else 
				{
					break;
				}
			}
		}else 
		{
			System.out.println("You dont have any transactions!!!");
		}
	}
}