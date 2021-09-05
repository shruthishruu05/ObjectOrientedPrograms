package com.bridgelabz.stockaccount;

import java.util.Scanner;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;

public class StockPortfolio {
	public static void main(String[] args) {
		LinkedList<Stock> stockList = new LinkedList<Stock>();
		System.out.println("Enter number of stocks");
		Scanner scanner = new Scanner(System.in);
		int numberOfStocks = scanner.nextInt();
		for(int index =0;index<numberOfStocks;index++)
		{
			System.out.println("Enter the stock name");
			String stockName = scanner.next();
			System.out.println("Enter number of Share");
			long numberOfShare = scanner.nextLong();
			System.out.println("Enter the Share Price");
			double sharePrice = scanner.nextDouble();
			Stock stock = new Stock(stockName, numberOfShare, sharePrice);
			stock.setCost();
			StockNode stockNode = new StockNode(stock);
			stockList.add(stockNode);
		}
		System.out.println("Stock Report");
		stockList.display();
		
		INode<Stock> tempNode = stockList.head;
		double totalCost=0;
		while(tempNode != null) {
			totalCost += tempNode.getKey().getCost(); 
			tempNode = tempNode.getNext();
		}
		
		System.out.println("Total Value Of Stock :"+totalCost);
	}
}
