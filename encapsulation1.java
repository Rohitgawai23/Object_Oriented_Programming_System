package Encapsulation;

public class encapsulation1 {
    private int id;
    private String name;
    private String city;
    private int salary;
    private String designation;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[] args) {
        encapsulation1 ob=new encapsulation1();
        ob.setId(123);
        ob.setName("Rohit");
        ob.setCity("Pune");
        ob.setSalary(30000);
        ob.setDesignation("software developer");

        System.out.println("ID : "+ob.getId());
        System.out.println("NAME : "+ob.getName());
        System.out.println("CITY : "+ob.getCity());
        System.out.println("SALARY : "+ob.getSalary());
        System.out.println("DESIGNATION : "+ob.getDesignation());

    }


}
