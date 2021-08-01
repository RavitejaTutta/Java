import java.util.*;
class RaceLe11
{
public static void main(String args[])
{
int a[]=new int[6],i,sum=0;
for(i=1;i<a.length;i++)
{
System.out.println("Enter  Racer:"+i+"  speed:");
Scanner sc=new Scanner(System.in);
a[i]=sc.nextInt();
sum=sum+a[i];
}
int avg=sum/5;
System.out.println("Average speed is:"+avg);
for(i=1;i<a.length;i++)
{
if(a[i]<avg)
System.out.println("Racer:"+i+" is Disqualified");
else
System.out.println("Racer:"+i+" is Qualified");
}
}
}