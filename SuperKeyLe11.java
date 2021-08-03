class A {
int x=10;
}
class SuperKeyLe11 extends A 
{
int x=20;
void display() 
{
System.out.println("x value from Derived class:"+x);
System.out.println("x value from Super class:"+super.x);
}
public static void main(String args[])
{
SuperKeyLe11 obj=new SuperKeyLe11();
obj.display();
}
}