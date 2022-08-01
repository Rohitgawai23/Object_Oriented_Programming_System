package Static_Keyword;

public class Static_memory_management {
    int id;
    String name, salary;
    String c_name="codenera";

     Static_memory_management(int id, String name, String salary)
     {
         this.id=id;
         this.name=name;
         this.salary=salary;
     }
    public void disp()
    {
        System.out.println(id+"\t"+name+"\t"+salary+"\t"+c_name);
    }
    public static void main(String[] args) {
        System.out.println("ID\tNAME\tSALARY\tCOMPANY NAME");

        Static_memory_management obj=new Static_memory_management(1, "Rohit", "30000");
        Static_memory_management obj1=new Static_memory_management(2, "Hemant", "10000");
        Static_memory_management obj2=new Static_memory_management(3, "Roshan", "60000");
        Static_memory_management obj3=new Static_memory_management(4, "prashant", "20000");
        Static_memory_management obj4=new Static_memory_management(5, "Tejas", "40000");


    }
}
