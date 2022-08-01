package This_keyword_use;
// 2: This can be call current class method internally
public class Tihiskeyword2 {
    public void display()
    {
        System.out.println("I am Java developer");
    }

    public void display1()
    {
        System.out.println("I am Python developer");
    }

    public void display2()
    {
        System.out.println("I am C++ developer");
    }

    public void display3()
    {
        System.out.println("I am C# developer");
    }
    public void display4()
    {
        System.out.println("I am C developer");
        this.display();
        this.display1();
        this.display2();
        this.display3();

    }

}
