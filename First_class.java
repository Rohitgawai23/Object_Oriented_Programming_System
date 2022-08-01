package This_keyword_use;

public class First_class {
    int a,b;

    public void display()
    {
        System.out.println(" The Value of a= "+a+" The value of  b="+b);
    }

    public void view()
    {
        int x=90;
        System.out.println(" The Value of x= "+x+" The value of  b="+b);

    }

    public static void main(String[] args) {
        First_class fc = new First_class();
        fc.a=89; fc.b=78;

        System.out.println(" The Value of a="+fc.a+" The Value of b="+fc.b);
      //   fc.display();
         fc.view();
    }
}
