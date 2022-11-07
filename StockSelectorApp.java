/**
 * Author: David Bowles
 * File: StockSelectorApp
 * Description: This application helps the user decide
 * 				how many stocks they can purchase.
 */

// Import java.util to access Scanner object.
import java.util.Scanner;

public class StockSelectorApp {
	public static void main(String[] args) {
		
		// Create Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declare variables.
		String ticker;
		double principal;
		double price;
		double PEratio;
		double amountCanPurchase;
		
		
		// Welcome user to the application.
		System.out.println("Hello! Welcome to the Stock Selector App.");
		System.out.println();
		
		// Prompt user to enter principal investment.
		System.out.print("Enter the amount of money you would like to invest: ");
		principal = input.nextDouble();
		
		// Prompt user to enter stock ticker.
		System.out.print("Enter the stock ticker: ");
		ticker = input.next();
		
		// While loop for a string length of no more than 5 characters.
		while (ticker.length()>5) {
			System.out.println("Invalid input. "); 
			System.out.print("Ticker must be 5 characters or less. Re-enter ticker: ");
			ticker = input.next();
		}
		
		// Prompt user to enter stock price.
		System.out.print("Enter stock price: ");
		price = input.nextDouble();
		
		// While loop allowing stock prices no less than $1.00.
		while (price < 1.00) {
			System.out.println("Invalid input. ");
			System.out.print("Price must be $1.00 or more. Re-enter price: ");
			price = input.nextDouble();
		}
		
		// Prompt user to enter the Price-to-Earnings ratio.
		System.out.print("Enter the P/E Ratio: ");
		PEratio = input.nextDouble();
		
		// Display final results.
		System.out.println();
		System.out.println("Below are your results: ");
		System.out.println();
		System.out.println("Stock: " + ticker.toUpperCase());
		System.out.println("Price: " + price);
		System.out.println("P/E Ratio: " + PEratio);
		
		// If condition to inform user of over-valued stock.
		if (PEratio > 45.00) {
			System.out.println("OVERVALUED STOCK!");
		}
		
		// Define amount of stocks user can purchase.
		amountCanPurchase = (principal / price);
		
		System.out.println("# of shares able to purchase: " + (int)amountCanPurchase);
		
	}		
}
