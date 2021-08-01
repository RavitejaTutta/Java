import java.util.*;
class QuadEqLe11
{
public static void main(String args[])
{
System.out.println("Enter a,b,c values:");
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=b*b-4.0*a*c;
double r1,r2;
if(d<0)
{
System.out.println("Roots are imaginary");
}
else if(d>0)
{
r1=(-b+Math.sqrt(d))/(2.0*a);
r2=(-b-Math.sqrt(d))/(2.0*a);
System.out.println("Roots are Real and Distinct");
System.out.println("Root1="+r1+"  Root2="+r2);
}
else if(d==0)
{
r1=(-b)/(2.0*a);
r2=r1;
System.out.println("Roots are Real and Equal");
System.out.println("Root1="+r1+"  Root2="+r2);
}
}
}