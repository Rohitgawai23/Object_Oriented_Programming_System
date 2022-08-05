package Interface;
// Q17.Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

interface user
{
    public void input();
    public void display();

}
class CheckPosiNegi implements user
{
    Scanner sc=new Scanner(System.in);
    int num,i;

    @Override
    public void input() {
        System.out.println("Enter the number here :");
        num=sc.nextInt();
    }

    @Override
    public void display() {

            if(num>0)
                System.out.println("Number is positive number");
            else if(num<0)
                System.out.println("Number is Negative number");

    }
}

public class posi_negi {
    public static void main(String[] args) {
        CheckPosiNegi ob=new CheckPosiNegi();
        ob.input();
        ob.display();
    }
}

/*
Output :

        Enter the number here :
        -3
        Number is Negative number

 */
