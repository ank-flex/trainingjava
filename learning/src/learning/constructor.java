package learning;

public class constructor {
    public constructor()
    {        this(1,2,3,4,5);
        System.out.println("default constructor");
    }
    public constructor(int a)
    {
        this(1,2,3);
        System.out.println("1 paramaterized constructor");
    }

    public constructor(int a, int b)
    {
        this(7);
        System.out.println("2 paramaterized constructor");
    }
    public constructor(int a, int b, int c)
    {
        this();
        System.out.println("3 paramaterized constructor");
    }
    public constructor(int a, int b,int c, int d)
    {
        this(5,6);
        System.out.println("4 paramaterized constructor");
    }
    public constructor(int a, int b,int c, int d,int e)
    {
        System.out.println("5 paramaterized constructor");
    }

    public static void main(String[] args) {
        constructor e = new constructor(1,2,3,4);

}

}
