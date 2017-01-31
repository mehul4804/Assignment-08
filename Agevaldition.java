package com.acad.agerror;

import java.util.Scanner;

public class Agevaldition 
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age :");
	      int a = s.nextInt();
	      System.out.println("Enter you name :");
	      String b = s.next();

	      try
	      {
	    	  if(a>100 || a<0)
	    	  {
	    		  throw new AgeExpt();
	    	  }
	      }
	    	catch(AgeExpt ex)
	    	{
	    	System.out.println("you have entered an invalid number : " +a);	
	    	}
	      finally
	      {
	    	  System.out.println("Your age is  : " +a);	
	    	  System.out.println("Your name is : " +b);	
		    	  
	      }
	}
}
