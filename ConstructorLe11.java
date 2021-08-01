class ConstructorLe11
{
int a;
int b;
ConstructorLe11()
{
a=10;
b=20;
System.out.println("Inside Constructor");
}
public void display()
{
System.out.println("A value="+a);
System.out.println("B value="+b);
}
public static void main(String args[]){
ConstructorLe11 c = new ConstructorLe11();
c.display();
}
}