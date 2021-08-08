//Write a Java Program that illustrates various methods of StringBuffer class. 


class StringBufferLe11
{
  
public static void main(String args[])
  
{
    
StringBuffer Sb1=new StringBuffer("abcd");
    
System.out.println("Length="+Sb1.length());
    
System.out.println("capacity="+Sb1.capacity());
    
System.out.println("Sb1="+Sb1);
    
Sb1.append("xyz");
    
System.out.println("Sb1="+Sb1);
    
Sb1.append(123);
    
System.out.println("Sb1="+Sb1);
    
char ch=Sb1.charAt(0);
    
System.out.println("ch="+ch);
    
Sb1.insert(4,"678");
    
System.out.println("Sb1="+Sb1);
    
Sb1.replace(5,8,"111");
    
System.out.println("Sb1="+Sb1);
    
String x=Sb1.substring(5,8);
    
System.out.println("Sb1="+Sb1);
    
Sb1.delete(4,7);
    
System.out.println("Sb1="+Sb1);
    
Sb1.setCharAt(0,'R');
    
System.out.println("Sb1="+Sb1);
    
Sb1.reverse();
    
System.out.println("Sb1="+Sb1);
 
}

}