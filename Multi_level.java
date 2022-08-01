package Inheritance;
import java.util.*;

class abc
{
    Scanner sc=new Scanner(System.in);
    String name;
    int id;
    int p_no;
    int salary;


    public void input()
    {
        System.out.println("Enter your name :");
        name=sc.nextLine();

        System.out.println("Enter your id :");
        id=sc.nextInt();

        System.out.println("Enter your phone no :");
        p_no=sc.nextInt();

        System.out.println("Enter your salary :");
        salary=sc.nextInt();
    }
}

class xyz extends abc
{
    public void disp()
    {
        System.out.println("NAME="+name);
        System.out.println("ID="+id);
    }
}

class pqr extends xyz
{
    public void method()
    {
        System.out.println("PHONE NO="+p_no);
        System.out.println("SALARY="+salary);

    }
}

public class Multi_level {
    public static void main(String[] args) {
    pqr obj=new pqr();
    obj.input();
    obj.disp();
    obj.method();

    }
}
/*
Output :
        Enter your name :
        Rohit
        Enter your id :
        122
        Enter your phone no :
        1234567890
        Enter your salary :
        25000
        NAME=Rohit
        ID=122
        PHONE NO=1234567890
        SALARY=25000

 */
