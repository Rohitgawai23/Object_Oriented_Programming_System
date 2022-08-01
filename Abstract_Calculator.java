package Abstraction;
import java.util.*;
abstract class Opration
{
    abstract void Sum();
    abstract void Sub();
    abstract void Multi();
    abstract void Div();
    abstract void Mod();

}
public class Abstract_Calculator extends Opration
{
    int a,b; //int a=10,b=20;
   static Scanner sc= new Scanner(System.in);

    @Override
    void Sum() {
        this.input();
        System.out.println("Addition :"+(a+b));
    }

    @Override
    void Sub()
    {
        this.input();
        System.out.println("Substraction :"+(a-b));
    }

    @Override
    void Multi() {
        this.input();
        System.out.println("Multiplication :"+(a*b));
    }

    @Override
    void Div() {
        this.input();
        System.out.println("Divistion :"+(a/b));
    }

    @Override
    void Mod() {
        this.input();
        System.out.println("Mod :"+(a%b));
    }
    void input()
    {
        System.out.println("Enter 1st value :");
        a=sc.nextInt();
        System.out.println("Enter 2st value :");
        b=sc.nextInt();
    }
    void manu()
    {
        System.out.println("----Calculator-----");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
    }
    void abc()
    {
        System.out.println("enter value");
        int c=sc.nextInt();
    }
    public static void main(String[] args) {
        Abstract_Calculator ob=new Abstract_Calculator();
            int ch;
            int c=1;
            do {
                ob.manu();
                System.out.println("Enter your choice,:");
                ch=sc.nextInt();
                switch (ch)
                {
                    case 1:
                    {
                        ob.Sum();
                        break;
                    }
                    case 2:
                    {
                        ob.Sub();
                        break;
                    }
                    case 3:
                    {
                        ob.Multi();
                        break;
                    }
                    case 4:
                    {
                        ob.Div();
                        break;
                    }
                    case 5:
                    {
                        ob.Mod();
                        break;
                    }
                    default :
                    {
                        System.out.println("Enter currect choice");
                    }
                }
                System.out.print("\n\tpress 1 for continue  \n");
               // if()
                {
                    c=0;
                    System.out.println("\n\n\tBye bye buddy .....!");
                }
            }while(c==1);
        ob.Sum();
        ob.Sub();
        ob.Multi();
        ob.Div();
        ob.Mod();

    }

}
