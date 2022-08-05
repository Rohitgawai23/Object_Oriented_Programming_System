package Interface;
// Q4.wap to create an interface  in that  two method first is input(),and second is result().you have to find
//   the area of circle by taking input by user with return type with no argument by creating a class name area.

import java.util.Scanner;

interface area
{
    public void input();
    public void result();
}
class circle implements area
{
    Scanner sc=new Scanner(System.in);
    int r;
    float pi= (float) 3.14;
    float A;

    @Override
    public void input() {
        System.out.println("Enter the radius :");
        r=sc.nextInt();
    }

    @Override
    public void result() {
        float A=pi*r*r;
        System.out.println("Area of Circle : "+A);
    }
}

public class AreaofCircle {
    public static void main(String[] args) {
        circle ob=new circle();
        ob.input();
        ob.result();
    }

}
/*
Output :

        Enter the radius :
        3
        Area of Circle : 28.26

 */