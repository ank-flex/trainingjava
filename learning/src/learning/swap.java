package learning;
import java.util.Scanner;

public class swap {
	
	public static void main(String[] args)
	{
		int temp;
	        Scanner s= new Scanner(System.in);
	        System.out.println("Please  enter the first number X1");
	        int x1=s.nextInt();
	        System.out.println("Please enter value of second number X2");
	        int x2=s.nextInt();
	        temp=x2;
	        x2=x1;
	        x1=temp;
	        System.out.println("new Value of x1 is " +x1+ " and  new value of x2 is " +x2);	        
	}
}
