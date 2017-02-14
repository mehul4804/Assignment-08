package com.acad.BankATMException;

public class UserDefinedException 
{
public static void main(String[] args)
{
	BankATM b = new BankATM();
	System.out.println("Current balance :RS " + b.balance());
	System.out.println("Withdrawing Rs 200"); 
	b.withdraw(200); 
	System.out.println("Current balance :RS " + b.balance());
	b.withdraw(10000);

	}

}
