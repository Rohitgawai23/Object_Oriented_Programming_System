package Inheritance_Ass;
// Q1) Java Program to copy all elements of one array into another array
import java.io.OptionalDataException;
import java.util.Scanner;
class Array_A
{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int i;

    public void input()
    {
        System.out.println("Enter element in array :");
        for(i=0; i<a.length; i++)
            a[i]=sc.nextInt();
    }
}

class Array_copy extends Array_A
{
    int b[]=new int[a.length];
    public void display()
    {
       for(i=0; i<a.length; i++)
           b[i]=a[i];
    }

    public void disp1()
    {
        System.out.println("\nelement you intered in an array");
        for(i=0; i<a.length; i++)
            System.out.println(a[i]+" ");

        System.out.println("\nelement after copy in second array");
        for(i=0; i<a.length; i++)
            System.out.println(b[i]+" ");
    }
}

public class Qone {
    public static void main(String[] args)
    {
        Array_copy Ac=new Array_copy();
        Ac.input();
        Ac.display();
        Ac.disp1();
    }
}
