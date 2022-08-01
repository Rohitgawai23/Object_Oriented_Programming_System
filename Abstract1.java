package Abstraction;

abstract class abc
{
    abstract void disp();
    abstract void disp1();

    public void disp3()
    {
        System.out.println("hello java");
    }
    abc()
      {
          System.out.println("hello codenera ");
      }

}
class duplicate extends abc
{
    void disp()
    {
        System.out.println("abstract method 1 body");
    }
    void disp1()
    {
        System.out.println("abstract method 2 body");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        duplicate ob=new duplicate();
        ob.disp3();
        ob.disp();
        ob.disp1();
    }
}
