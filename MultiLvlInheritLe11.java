class X
{
public void methodX()
{
System.out.println("Class X method");
}
}
class Y extends X
{
public void methodY()
{
System.out.println("class Y method");
}
}
class MultiLvlInheritLe11 extends Y
{
public void methodZ()
{
System.out.println("class Z method");
}
public static void main(String args[])
{
MultiLvlInheritLe11 obj = new MultiLvlInheritLe11();
obj.methodX();
obj.methodY();
obj.methodZ(); 
  }
}