package Interface;
/*Q3.Wap to create two interface first and second . inside first create two method  void input()
  and int disp(),and in interface second create two method void getdata() and  void setdata()
  create two class A1 and A2 use interface first in class A1 and second in A2.
  extend A1 in A2 and also implement both interface in A2.perform any mathematical operation in these two class.
 */
interface first
{
    public void input();
    public void disp();
}
interface second
{
    public void getdata();
    public void setdata();
}

class A1
{
    public void input() {

    }

    public void disp() {

    }
}
class A2 extends A1
{

}
public class mathematical_operation {
    public static void main(String[] args) {

    }
}
