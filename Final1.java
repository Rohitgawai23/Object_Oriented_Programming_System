package Final_Keyword;

class abc
{
    final int a=10;
}

public class Final1 extends abc
{
    public void disp()
    {
      //  a=100;                     // final variable ka value change nah kar sakte
        System.out.println(a);
    }


    public static void main(String[] args)
    {
        Final1 obj=new Final1();
        obj.disp();
    }
}
