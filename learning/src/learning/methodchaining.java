package learning;

public class methodchaining {
    public void default_paramethod()
    {
    System.out.println("Default method");
    }
    public void paramethod1(int a)
    {
        System.out.println("1 paramaterized method");
    }
    public void paramethod2(int a, int b)
    {
        System.out.println("2 paramaterized method");
    }
    public void paramethod3(int a, int b, int c)
    {
        System.out.println("3 paramaterized method");
    }
    public void paramethod4(int a, int b, int c, int d)
    {
        System.out.println("4 paramaterized method");
        this.default_paramethod();
        this.paramethod1(1);
        this.paramethod2(1,2);
        this.paramethod5(1,2,3,4,5);
        this.paramethod3(1,2,3);
    }
    public void paramethod5(int a, int b, int c, int d, int e)
    {
        System.out.println("5 paramaterized method");
    }
    public static void main(String[] args) {
        methodchaining method = new methodchaining();
        method.paramethod4(1,2,3,4);
    }
    }

