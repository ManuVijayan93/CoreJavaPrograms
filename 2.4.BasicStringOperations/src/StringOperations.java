
public class StringOperations{
public static void main(String arg[])
{ 
	String s="Raj";
	System.out.println("My Name".length());
	System.out.println(s);
	String s1=s.concat("Kumar");
	System.out.println("Now the String:"+s);
	
	System.out.println("Now the new String:"+s1);
	System.out.println("Now the Upper case String:"+s1.toUpperCase());
	System.out.println("Now the Lower case String:"+s1.toLowerCase());
	System.out.println("Now the sub String:"+s1.substring(2,5));
	

}
}
