package Interface;
//5.Wap to create interface Print the average of three numbers entered by user by creating a class named 'Avarage' having a
//        method to calculate and print the average.

import java.util.Scanner;

interface avg
{
    public void input();
    public void disp();

}
class Avarage implements avg
{
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    double Avg;
    @Override
    public void input() {
        System.out.println("Enter the value of 1st number ");
        a=sc.nextInt();
        System.out.println("Enter the value of 2nd number ");
        b=sc.nextInt();
        System.out.println("Enter the value of 3rd number ");
        c=sc.nextInt();
        Avg=(a+b+c)/3;
    }

    @Override
    public void disp() {
        System.out.println("Average of 3 Numbers is : "+Avg);
    }
}

public class AveragePrint {
    public static void main(String[] args) {
        Avarage ob=new Avarage();
        ob.input();
        ob.disp();
    }
}

/*
Output :

Enter the value of 1st number
15
Enter the value of 2nd number
20
Enter the value of 3rd number
15
Average of 3 Numbers is : 16.0

 */