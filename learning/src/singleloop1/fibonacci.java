package singleloop1;

public class fibonacci {
	
	public static void main(String[] args)
	{
		int x1=0,x2=1;
		System.out.println("Fibonacci series upto 12 numbers is:");
		System.out.print(x1+ " " +x2);
		for(int i=2; i<=11; i++)
		{
			int x3 =x1+x2;
			x1=x2;    
			x2=x3;  
			System.out.print(" " +x3 );
		}	
	}
	
	}