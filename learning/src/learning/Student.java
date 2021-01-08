package learning;

public class Student
{ //this is the boundary of the class
    int age=33,roll_num=123;//variable
    public void display1() //this is a method
    {
        System.out.println("Here is display 1");

    }
    public void display2() //this is a method
    {
        System.out.println("Here is display 2");

    }

    public static void main(String[] args)
    {
        Student object1=new Student();
        object1.display1();
        object1.display2();
        System.out.println("My age is " +object1.age +" and my roll number is " +object1.roll_num);
    }
}

