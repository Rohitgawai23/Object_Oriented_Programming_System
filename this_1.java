package This_keyword_use;

public class this_1
{
    String name="I am java developer";

    public void display()
    {
        String name="I am developer";
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        this_1 obj=new this_1();
        obj.display();
    }
}
