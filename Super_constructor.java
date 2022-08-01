package Super_keyword;

class parent
{
    parent()
    {
        System.out.println("Hello I am parent class constructor");
    }
}

class child
{
    child(String name)
    {
        super();
        System.out.println("NAME="+name);
    }
}


public class Super_constructor {
    public static void main(String[] args) {
        child obj=new child("Rohit Gawai");
    }
}
