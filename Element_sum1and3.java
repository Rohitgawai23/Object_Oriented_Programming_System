package Interface;
// 6..Write a program  enter an array and find sum of  first and third element .

interface sum
{
    public void input();
    public void display();
}
class Element_sum implements sum
{
    int arr[]={12,22,8,4,5};
    int i,a,b;
    int sum;

    @Override
    public void input() {

        for(i=0; i<arr.length; i++)
        {
            sum=arr[0]+arr[2];
        }
    }

    @Override
    public void display() {
        System.out.println("Sum of 1st and 3rd Element is : "+sum);
    }
}


public class Element_sum1and3 {
    public static void main(String[] args) {
        Element_sum ob=new Element_sum();
        ob.input();
        ob.display();
    }
}


/*
Output :

        Sum of 1st and 3rd Element is : 20

 */