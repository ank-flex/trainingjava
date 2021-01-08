package learning;

public class thissuperchild extends thissuperparent
{
    public thissuperchild()

    {
        super(1,2,3);
        System.out.println("default child constructor");
    }
    public thissuperchild(int a)
    {
     //   super(1,2);
        this(1,2);
        System.out.println("1 child paramaterized constructor");
    }

    public thissuperchild(int a, int b)
    {
        this();
        System.out.println("2 child paramaterized constructor");
    }
    public thissuperchild(int a, int b, int c)
    {
        this(1,2,3,4);
        System.out.println("3 child paramaterized constructor");
    }
    public thissuperchild(int a, int b,int c, int d)
    {

        this(1);
        System.out.println("4  child paramaterized constructor");
    }


    public static void main(String[] args) {

        thissuperchild e = new thissuperchild(1,2,3);

    }

}
