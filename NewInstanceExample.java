public class NewInstanceExample  
{  
String str="Creating object with Class.newInstance() method";  
public static void main(String args[])  
{  
try  
{
NewInstanceExample obj= NewInstanceExample.class.getDeclaredConstructor().newInstance();   
System.out.println(obj.str);          
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  