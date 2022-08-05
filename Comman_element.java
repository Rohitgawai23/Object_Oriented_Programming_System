package Interface;
//8. Write a Java program to find the common elements between two arrays (int values)
//        Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and
//        arr2[] = [39, 25, 15, 23, 55, 91,66, 22],
//        so common between two arrays are 23 and 91

import java.util.Scanner;

interface comman
{
    public void input();
    public void display();

}
class FindComman implements comman
{
    Scanner sc=new Scanner(System.in);
    int i,j;
    int a[]=new int [10];
    int b[]=new int [10];

    @Override
    public void input()
    {
        System.out.println("Enter the 1st array :");
        for(i=0; i<a.length;i++)
                a[i]=sc.nextInt();

        System.out.println("Enter the 2st array :");
        for(i=0; i<b.length;i++)
            b[i]=sc.nextInt();

    }

    @Override
    public void display() {
        System.out.println("comman element are :");
       for(i=0; i<a.length; i++)
       {
           for(j=0; j<b.length; j++)
           {
               if(a[i]==b[j])
                   System.out.println(a[i]+" ");
           }
       }

    }
}


public class Comman_element {
    public static void main(String[] args) {
        FindComman ob=new FindComman();
        ob.input();
        ob.display();
    }
}

/*
Output :

        Enter the 1st array :
        12 34 32 56 78 1 2 3 4 5
        Enter the 2nd array :
        1 2 77 8 55 66 99 44 33 10
        comman element are :
        1
        2


 */
