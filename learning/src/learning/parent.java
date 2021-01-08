package learning;

public class parent {
    public parent()
        {

            System.out.println("default parent constructor");
        }
    public parent(int a)
        {
        this(1,2,3,4);
            System.out.println("1 parent paramaterized constructor");
        }

    public parent(int a, int b)
        {
            this(1);
            System.out.println("2 parent paramaterized constructor");
        }
    public parent(int a, int b, int c)
        {
        this(1,2);
            System.out.println("3 parent paramaterized constructor");
        }
    public parent(int a, int b,int c, int d)
        {
            this();
            System.out.println("4 parent paramaterized constructor");
        }



}
