package singleloop1;

import java.util.Scanner;

public class primenumber
{

public static void main(String[] args)
{
	int temp;
	boolean isPrime=true;
	 Scanner s= new Scanner(System.in);
     System.out.println("Please  enter the positive number");
     int x1=s.nextInt();
     for(int i=2;i<=x1/2;i++)
 	{
            temp=x1%i;
 	   if(temp==0)
 	   {
 	      isPrime=false;
 	      break;
 	   }
 	}
 	//If isPrime is true then the number is prime else not
 	if(isPrime)
 	   System.out.println(x1 + " is a Prime Number");
 	else
 	   System.out.println(x1 + " is not a Prime Number");
 
    }
 }