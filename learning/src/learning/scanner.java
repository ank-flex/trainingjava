package learning;
import java.util.Scanner;

public class scanner {
    public int plus(int x1, int x2)
    {
        int plus;
        plus=x1+x2;
        return plus;
    }
    public int minus(int a, int b)
    {
        int minus;
        minus=a-b;
        return minus;
    }
    public int multiply(int a, int b)
    {
        int multiply;
        multiply=a*b;
        return multiply;
    }
    public void divide(int a, int b)
    {
        int div;
        div=a/b;
        System.out.println("Final result is " +div);
        // return div;
    }
    public static void main (String [] args)
    {
        scanner var1= new scanner();
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter value of x1");
        int x1=s.nextInt();
        System.out.println("Please enter value of x2");
        int x2=s.nextInt();
        int output1=var1.plus(x1,x2);
        System.out.println("Please enter value of x3");
        int x3=s.nextInt();
        int output2=var1.minus(output1,x3);
        System.out.println("Please enter value of x4");
        int x4=s.nextInt();
        int output3= var1.multiply(output2,x4);
        System.out.println("Please enter value of x5");
        int x5=s.nextInt();
        int output4=var1.plus(output3,x5);
        System.out.println("Please enter value of x6");
        int x6=s.nextInt();
        var1.divide(output4,x6);
    }
}
