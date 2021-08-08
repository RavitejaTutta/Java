class Rectangle
{
int l=8,b=4;
int area;
public void area()
{
area=l*b;
System.out.println("Area of rectangle: "+area);
}
}
class Square extends Rectangle
{
public void area() //overridden method
{
area=l*l;
System.out.println("Area of square: "+area);
}
}
class Triangle extends Rectangle
{
public void area()   //overridden method
{
area=(b*l)/2;
System.out.println("Area of triangle: "+area);
}
}
public class RuntimePolyLe11
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.area();
r=new Square();     //superclass reference referring to subclass Square object so,at run time it will call Square area()
r.area();
r=new Triangle();  //superclass reference referring to subclass Triangle object so,at run time it will call triangle area()     
r.area();
}
}
 