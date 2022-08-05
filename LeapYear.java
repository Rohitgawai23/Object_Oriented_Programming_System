package Interface;
import java.util.Scanner;

interface leap
{
    public void input();
    public void display();
}
class Impl_leap implements leap
{
    Scanner sc=new Scanner(System.in);
    int year;
    @Override
    public void input() {
        System.out.println("Enter any year : ");
        year = sc.nextInt();
    }

    @Override
    public void display() {

        if((year%4==0 && year%100!=0) ||(year%400==0))
        {
            System.out.println("Entered year is a leap year");
        }
        else {
            System.out.println("Entered year is not a leap year");
        }
    }
}


public class LeapYear {
    public static void main(String[] args) {
        Impl_leap ob=new Impl_leap();
        ob.input();
        ob.display();
    }
}



/*
OUtput :

        Enter any year :
        2022
        Entered year is not a leap year

 */

