interface IF1
{
int x=10;
void display();
}
interface IF2
{
int y=20;
void show();
}
class A
{
int c=30;
}
class B extends A implements IF1,IF2
{
public void display()
{
System.out.println("Display method from interface-1 x="+x+" y="+y+" c="+c);
}
public void show()
{
System.out.println("Display method from interface-2 x="+x+" y="+y+" c="+c);
}
}
class InterfaceLe11
{
public static void main(String args[])
{
B obj=new B();
obj.display();
obj.show();
}
} 