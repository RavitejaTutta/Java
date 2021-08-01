class A
{
public void methodA()
{
System.out.println("Base class method");
}
}

class SingleInheritLe11 extends A
{
public void methodB()
{
System.out.println("Child class method");
}
public static void main(String args[])
{
SingleInheritLe11 obj = new SingleInheritLe11();
obj.methodA();
obj.methodB();
  }
}