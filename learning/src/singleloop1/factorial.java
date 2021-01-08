package singleloop1;

import java.util.Scanner;

public class factorial {
	
	 public static void main(String args[]){ 
		 
		System.out.println("Please enter a positive number");
		 Scanner s= new Scanner(System.in);
		 int a= s.nextInt();
		  int i,fact=1;  
		  for(i=1;i<=a;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+a+" is: "+fact);    
		 } 

}
