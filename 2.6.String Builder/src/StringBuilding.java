
public class StringBuilding {
	public static void main(String[] args) 
	{
		String str1="Hello This is a Sample String";
		String P1=str1.concat("-Extra String");
		
		System.out.println("String Str:"+str1);
		System.out.println("String P1: "+P1);
		
		StringBuffer sb=new StringBuffer("Hello String");
		sb.append("-Extra String");
		
		System.out.println("String Buffer : "+sb);
		
		StringBuilder sb1=new StringBuilder("My String");
		sb1.append("-Extra String to String Builder");
		
		System.out.println(sb1);
	}

}
