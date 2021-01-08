package learning;
public class bodmas1 {

    public int plus(int a, int b)
    {
        int plus;
        plus=a+b;
        System.out.println("Plus result is " +plus);
        return plus;
    }
    public int minus(int a, int b)
    {
        int minus;
        minus=a-b;
        System.out.println("Minus result is " +minus);
        return minus;
    }
    public int multiply(int a, int b)
    {
        int multiply;
        multiply=a*b;
        System.out.println("Final result is " +multiply);
        return multiply;
    }

    public int divide(int a, int b)
    {
        int div;
        div=a/b;
        System.out.println("Division result is " +div);
        return div;
    }

    public static void main (String [] args)
    {
        bodmas1 var1= new bodmas1();
        int output1=var1.divide(10,2);
        int output2=var1.minus(output1,2);
        int output3= var1.plus(output2,2);
        int output4=var1.minus(output3,2);
        var1.multiply(output4,2);
    }
}
