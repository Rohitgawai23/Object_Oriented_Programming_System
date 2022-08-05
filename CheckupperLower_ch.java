package Interface;

import java.util.Scanner;

interface check
{
    public void input();
    public void display();

}

class upper_lower implements check
{
    Scanner sc=new Scanner(System.in);
    char ch;
    @Override
    public void input() {
        System.out.println("Enter the Charactor :");
        ch=sc.next().charAt(0);
    }

    @Override
    public void display() {
        if(ch>='A' && ch<='Z' )
            System.out.println("Character is upper case :");
        else if(ch>='a' && ch<='z')
            System.out.println("Character is lower case :");
    }
}


public class CheckupperLower_ch {
    public static void main(String[] args) {
        upper_lower ob=new upper_lower();
        ob.input();
        ob.display();
    }
}
/*
Output :

        Enter the Character :
        G
        Character is upper case :

 */