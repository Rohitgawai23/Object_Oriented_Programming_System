package Polymororphism;

public class Method_overloading {
    public void disp(int a, int b)
    {
        System.out.println("int sum :"+(a+b));
    }
    public void disp(String name)
    {
        System.out.println(name);
    }
    public void disp(double a,double b)
    {
        System.out.println("double sum :"+(a+b));
    }
    public void disp(char ch)
    {
        System.out.println(ch);
    }
    public static void main(String[] args) {
        Method_overloading Mo=new Method_overloading();
        Mo.disp(5,5);
        Mo.disp("Rohit");
        Mo.disp(4.2,4.2);
        Mo.disp('R');
    }
}
