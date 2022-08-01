package This_keyword_use;
  // 1:  This can be used to refer current class instance variable.
  //      instance variable and local variable must be same.

public class Thiskeyword1 {

      int a,b;    // instance variable

   Thiskeyword1(int a, int b)  // - local variable
   {
      this.a=a;
      this.b=b;
   }

   public void display()
   {
      System.out.println("The value of a is "+a+"\nThe value of b is "+b);
   }

   public static void main(String[] args)
   {
         Thiskeyword1 tk=new Thiskeyword1(3,5);
         tk.display();

   }

}
