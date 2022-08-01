package Polymororphism;

class abc
{
    public void disp()
    {
        System.out.println("hello i am parent class");
    }
    public void disp1()
    {
        System.out.println("hello java");
    }
}

class child extends abc
{
    @Override
    public void disp()
    {
        System.out.println("hello  i am child class");
        System.out.println("and i am overriding");
        //super.disp();
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        child ob=new child();
        ob.disp();
        ob.disp1();
    }
}
