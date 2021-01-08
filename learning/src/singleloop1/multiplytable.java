package singleloop1;

import java.util.Scanner;

public class multiplytable 
{
	public static void main(String[] args)
{
		System.out.println("Please  enter the positive number");
	     int x1=new Scanner(System.in).nextInt();
	     System.out.println("Multiplication table of " +x1);
	     for (int i=1; i<=10; i++)
	     {
	    	 int k=x1*i;
	    		 System.out.print(x1+ " * " +i+ " = " +k);
	    		 System.out.println();
	    		 
	    	 }					
}
}
