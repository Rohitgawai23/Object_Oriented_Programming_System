package This_keyword_use;

public class this_2 {
    public void mathod1()
    {
        System.out.println("I am java developer 1");
    }
    public void mathod2()
    {
        System.out.println("I am java developer 2");
    }
    public void mathod3()
    {
        System.out.println("I am java developer 3");
    }
    public void mathod4()
    {
        System.out.println("I am java developer 4");
        this.mathod1();
        this.mathod2();
        this.mathod3();
    }
    public static void main(String[] args) {
        this_2 obj=new this_2();
        obj.mathod4();
    }
}
