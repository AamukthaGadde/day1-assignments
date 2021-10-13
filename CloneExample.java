public class CloneExample implements Cloneable   
{
protected Object clone() throws CloneNotSupportedException   
{   
return super.clone();   
}   
String name = "Microprocessor";   
public static void main(String[] args)   
{   
CloneExample obj1 = new CloneExample(); 
try  
{   
CloneExample obj2 = (CloneExample) obj1.clone();   
System.out.println(obj1.name);   
}   
catch (Exception e)   
{   
e.printStackTrace();   
}   
}   
}  