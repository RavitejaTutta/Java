class Room
{
int width,length,height;
int getArea()
{
return width*length;
}
int getVolume()
{
return width*length*height;
}
}
class ClassMethodLe11
{
public static void main(String args[])
{
Room obj=new Room();
obj.width=10;
obj.length=20;
obj.height=30;
int area=obj.getArea();
int vol=obj.getVolume();
System.out.println("Area of Room is:"+area);
System.out.println("Volume of Room is:"+vol);
}
}
