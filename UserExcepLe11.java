import java.util.*;
class MyException extends Exception
{
MyException(String s)
{
super(s);
}
}cls
class UserExcepLe11
{
public static void main(String args[])
{
int marks=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks:");
try
{
marks=sc.nextInt();
if((marks<0)||(marks>100))
{
marks=0;
throw new MyException("Marks should be between 0 and 100 only.!!");
}
}
catch(MyException me)
{
System.out.println(me.getMessage());
}
catch(Exception e)
{
System.out.println("Error occurred...");
}
System.out.println("Marks="+marks);
}
}