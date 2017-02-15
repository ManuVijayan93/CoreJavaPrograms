
public class StringBuffering {

	public static void main(String[] args) 
	{
		String str1="Hello This is a Sample String";
		str1.concat("-Extra String");
		
		System.out.println("String Str:"+str1);
		
		StringBuffer sb=new StringBuffer("Hello String");
		sb.append("-Extra String");
		
		System.out.println("String Buffer : "+sb);
		

	}

}

