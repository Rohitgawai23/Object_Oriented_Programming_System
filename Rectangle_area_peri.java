package Interface;
import java.util.Scanner;

// 1.Write a Java program to enter length and breadth of a rectangle and find its perimeter and area.
interface A
{
    public void area();
    public void perimeter();
    public void input();
}
class Impl implements A
{
    int l,b;
    Scanner sc=new Scanner(System.in);

    @Override
    public void area() {
        int area=l*b;
        System.out.println("Area of Rectangle :"+area);

    }

    @Override
    public void perimeter() {
        int perimeter=2*(l+b);
        System.out.println("Perimeter of Rectangle :"+perimeter);
    }

    @Override
    public void input() {
        System.out.println("Enter the length :");
        l=sc.nextInt();
        System.out.println("Enter the breadth :");
        b=sc.nextInt();
    }
}
public class Rectangle_area_peri {
    public static void main(String[] args) {
        Impl ob=new Impl();
        ob.input();
        ob.area();
        ob.perimeter();
    }
}
/*
Output :

        Enter the length :
        2
        Enter the breadth :
        3
        Area of Rectangle :6
        Perimeter of Rectangle :10

 */