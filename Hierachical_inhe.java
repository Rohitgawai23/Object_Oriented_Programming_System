package Inheritance;

import java.util.*;
class _p
{
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    _p()                            // constructor method name class name will be same
    {
        System.out.println("ADDITION");
        System.out.println("Enter first value : ");
        a = sc.nextInt();
        System.out.println("Enter second value : ");
        b = sc.nextInt();
        c=a+b;
        System.out.println("Addition is  : "+c);
    }
}

class _C extends _p
{
    _C(int d)
    {
        super();
        System.out.println("\nSUBTRACTION");
        System.out.println("Enter first value : ");
        a = sc.nextInt();
        System.out.println("Enter second value : ");
        b = sc.nextInt();
        c=a-b;
        System.out.println("Subtraction is : "+c);
    }
}

class _D extends _p
{
    _D()
    {
        super();
        System.out.println("\nMULTIPLICATION");
        System.out.println("Enter first value : ");
        a = sc.nextInt();
        System.out.println("Enter second value : ");
        b = sc.nextInt();
        c=a*b;
        System.out.println("Multiplication is : "+c);
    }
}
public class Hierachical_inhe {

    public static void main(String[] args)
    {
        _C c = new _C(0);
        _D d = new _D();

    }

}