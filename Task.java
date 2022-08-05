package Interface;
//Q9.Write a program to create interface A1 in this interface we have two
//   method meth1 and meth2. Implements this interface in another class
//   named MyClass and perform any task.

import java.util.Scanner;

interface A11
{
    abstract void math1();
    public void math2();
}

class MyClass implements A11
{
    int a,b;
    Scanner sc=new Scanner(System.in);

    @Override
    public void math1() {
        System.out.println("Enter the 1st Number :");
        a=sc.nextInt();
        System.out.println("Enter the 2nd Numebr :");
        b=sc.nextInt();
    }

    @Override
    public void math2() {
        System.out.println("Multiplication of 1st and 2nd number is : "+(a*b));
    }
}

public class Task {
    public static void main(String[] args) {
        MyClass ob=new MyClass();
        ob.math1();
        ob.math2();
    }
}


/*
Output :

        Enter the 1st Number :
        5
        Enter the 2nd Numebr :
        5
        Multiplication of 1st and 2nd number is : 25

 */
