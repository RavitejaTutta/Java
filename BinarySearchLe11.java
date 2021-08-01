import java.util.*;
class BinarySearchLe11
{  
public static void binarySearch(int arr[], int first, int last, int key)
{  
int mid=(first+last)/2;  
while(first<=last)
{  
if(arr[mid]<key)
{  
first = mid + 1;  
}   
else if(arr[mid]==key)
{  

System.out.println("Element is found at position:"+(mid+1));  
break;  
}
else
{  
last = mid - 1;  
}  
mid = (first + last)/2;  
}  
if(first>last)
{  
System.out.println("Element is not found!");  
}  
}  
public static void main(String args[])
{  
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter "+n+" elements:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter a number to search:");
int key=sc.nextInt();  
int last=arr.length-1;  
binarySearch(arr,0,last,key);     
}  
}  