package Session1;

import java.util.Scanner;

public class KeyBoardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Scanner object to input data ffrom keyboard.
		Scanner s = new Scanner(System.in);
		// declare variables to store data entered via keyboard
		String customerName;
		double balance;
		int accNumber;
		// prompt the user to enter customer name and store it in varible customerName
		System.out.println("Enter the name of the account holder -> ");
		customerName = s.next(); // obtain the string from keyboard
		
		// prompt the user enter account number
		System.out.println("Enter the account number -> ");
		accNumber = s.nextInt();
		
		// prompt the user balance
		System.out.println("Enter the balance - > ");
		balance = s.nextDouble();
		
		// now out the data to the screen
		// first display on seprate lines
		System.out.println("Account Number: "+ accNumber);
		System.out.println("Account Balance: "+ balance);
		System.out.println("Account Holder: "+ customerName);
		System.out.println("========================================");
		
		// print of one line
		System.out.println("Account Number: "+accNumber+", Balance : "+balance+",Account Holder: "+customerName);
		
		
		

	}

}
