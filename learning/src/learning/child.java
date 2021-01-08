package learning;

public class child extends parent
{
    public child()

    {
        this(1,2,3);
        System.out.println("default child constructor");
    }
    public child(int a)
    {
        super(1,2,3);
        System.out.println("1 child paramaterized constructor");
    }

    public child(int a, int b)
    {
        this(1,2,3,4);
        System.out.println("2 child paramaterized constructor");
    }
    public child(int a, int b, int c)
    {
        this(1);
        System.out.println("3 child paramaterized constructor");
    }
    public child(int a, int b,int c, int d)
    {

        this();
        System.out.println("4  child paramaterized constructor");
    }


    public static void main(String[] args) {

        child e = new child(1,2);

    }

}
