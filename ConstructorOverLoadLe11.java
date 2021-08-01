class ConstructorOverLoadLe11
{
int a,b;
ConstructorOverLoadLe11()
{
a=10;
b=20;
System.out.println("From 1st Constructor");
}
ConstructorOverLoadLe11(int x)
{
a=x;
System.out.println("From 2nd Constructor");
}
ConstructorOverLoadLe11(int x,int y){
a=x;
b=y;
System.out.println("From 3rd Constructor");
}
public void display(){
System.out.println("A="+a);
System.out.println("B="+b);
}
public static void main(String args[]){
ConstructorOverLoadLe11 c1 = new ConstructorOverLoadLe11();
ConstructorOverLoadLe11 c2 = new ConstructorOverLoadLe11(30);
ConstructorOverLoadLe11 c3 = new ConstructorOverLoadLe11(30,40);
c1.display();
c2.display();
c3.display();
}
}