//Write a Java Program that illustrates various methods of String class.


import java.util.*;

class StringMethodsLe11
{

public static void main(String args[])

{
  
String s1="abcd";

String s2="abcd";
  
String s3=new String("abcd");
  
String s4=new String("abcd");
  
System.out.println("s1==s2 "+(s1==s2));
  
System.out.println("s1==s3 "+(s1==s3));
  
System.out.println("s1.equals(s2) "+(s1.equals(s2)));
  
System.out.println("s1.equals(s3) "+(s1.equals(s3)));
  
String s5=s4.replace("a","x");
  
System.out.println("s5 "+s5);
  
String s6=s4.toUpperCase();
  
System.out.println("s6 "+s6);
  
String s7="       abcd         ".trim();
  
System.out.println("s7 "+s7);
  
String s8=s6.toLowerCase();
  
System.out.println("s8 "+s8);
  
System.out.println("s5 "+s5); 
  
System.out.println("length of "+s8+" is "+s8.length());
  
System.out.println(s1.compareTo(s6));
  
System.out.println(s1.compareToIgnoreCase(s6));
  
String s9=s1.substring(2,4);
  
System.out.println(s1+"   "+s9);


}

}