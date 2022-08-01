package Super_keyword;


class abc
{
    public void input()
    {
        System.out.println("Hello I am parent class method ");
    }
}

class pqr extends abc
{
    public void input()
    {
        System.out.println("Hello I am copy of parent class method ");
    }
    public void disp()
    {
        System.out.println("Hello I am child class method ");
         super.input();
    }
}


public class Super_1 {
    public static void main(String[] args) {
        pqr obj=new pqr();    //  create object
        obj.disp();             // calling object
    }
}
