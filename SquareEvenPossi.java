package Inheritance_Ass;
import java.util.Scanner;
// Q2) Java Program to print the square of the elements of an array present on even position
class Square
{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int i;

    public void Input()
    {
        System.out.println("Enter element in array");
        for(i=0; i<a.length; i++)
            a[i]=sc.nextInt();
    }
}
class Square1 extends Square
{
   /* public void display()
    {
        System.out.println("Square of the element in array :");
        for(i=0; i<a.length; i++)
            System.out.println(a[i]+" ");
    }*/
    public void logic()
    {
        for(i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
                a[i]=a[i]*a[i];
        }

        System.out.println("\nElement of an array after squaring even position are");
        for(i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }

}

public class SquareEvenPossi {
    public static void main(String[] args) {
        Square1 obj=new Square1();
        obj.Input();
        obj.logic();




    }
}
/*
Output :
        Enter element in array
        1 2 3 4 5 6 7 8 9 10

        Element of an array after squaring even position are
        1 4 3 16 5 36 7 64 9 100

 */
