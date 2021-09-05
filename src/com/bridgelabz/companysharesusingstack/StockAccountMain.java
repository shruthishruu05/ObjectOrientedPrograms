package com.bridgelabz.companysharesusingstack;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;

public class StockAccountMain 
{

	public static void main(String[] args) 
	{
		boolean isExit = false;
		int choice;
		int indexOfCustomer = 0;
		int indexOfCompany = 0;

		int customerId;
		String companySymbol;
		int numOfCompanyShareToBuy;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HHmmss");
		String companyName;
		int companyShares;
		int companySharePrice;
		int companyTotalValue;
		LinkedList<Companyshares> listOfCompanies = new LinkedList<Companyshares>();
		LinkedList<Transactions> transList = new LinkedList<Transactions>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Companies ");
		int numberOfCompanies = scanner.nextInt();
		for(int index=0;index<numberOfCompanies;index++) {
			System.out.println("Enter Company share information");
			System.out.println("Enter Company Symbol");
			companySymbol =  scanner.next();
			System.out.println("Enter Company name");
			companyName =  scanner.next();
			System.out.println("Enter Company share");
			companyShares =  scanner.nextInt();
			System.out.println("Enter Company share price");
			companySharePrice =  scanner.nextInt();
			System.out.println("Enter Company company Total Value");
			companyTotalValue =  scanner.nextInt();
			Companyshares companyshares = new Companyshares(companySymbol, companyName, companyShares, companySharePrice, companyTotalValue);
			CompanysharesModel compModel = new CompanysharesModel(companyshares);
			listOfCompanies.add(compModel);
		}
		LinkedList<Customerinfo> listOfCustomers = new LinkedList<Customerinfo>();
		System.out.println("Enter number of Customers ");
		int numberOfCustomers = scanner.nextInt();
		for(int index=0;index<numberOfCustomers;index++) {
			System.out.println("Enter Customer Information");
			System.out.println("Enter Customer Symbol");
			String customerSymbol =  scanner.next();
			System.out.println("Enter Customer name");
			String customerName =  scanner.next();
			System.out.println("Enter Customer share");
			int customerShares =  scanner.nextInt();
			System.out.println("Enter Customer Balance");
			int customerBalance =  scanner.nextInt();
			Customerinfo customerInfo = new Customerinfo(customerSymbol, customerName, customerShares,customerBalance);
			CustomerinfoModel customerModel = new CustomerinfoModel(customerInfo);
			listOfCustomers.add(customerModel);
			
		}
		LinkedList<Transactions> transModel = new LinkedList<Transactions>();
		System.out.println("Please enter customer name");
		String customerName = scanner.next();
		INode<Customerinfo> tempNode = listOfCustomers.head;
		boolean flag = true;
		while(tempNode != null) {
			if(tempNode.getKey().getCustomer_name().equals(customerName))
			{
				flag =true;
				break;
			}
			else
				flag = false;
			tempNode = tempNode.getNext();
		}
		StockAccount stockAccount = new StockAccount();
		if(flag == true) {
			while(!isExit) {
				System.out.println("Welcome "+customerName);
				System.out.println("Please select options\n" + "1. buy shares\n" + "2. sell shares\n"
						+ "3. print report\n" + "4. Display stack\n"+"5. Exit");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					stockAccount.buy(listOfCompanies, tempNode, transList);
					break;
				case 2:
					stockAccount.sell(listOfCompanies, tempNode, transList);
					break;
				case 3:
					stockAccount.printReport(tempNode, transList);
					break;
				case 4:
					stockAccount.showStack();
					break;
				case 5:
					isExit = true;
					System.out.println("Thank you for using service");
					break;
				default:
					break;
				}
			}
		}
		else {
			System.out.println("Invalid Customer name. Please enter valid customer name");
		}
	}
}
		

		


