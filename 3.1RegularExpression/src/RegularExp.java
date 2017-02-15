import java.util.regex.*;
public class RegularExp {
	public static void main(String[] args) 
	{
		String str="Tendulkar is a Legend of 21st Century";
		
		 
		Pattern p=Pattern.compile("L....d");//'.'=1 character
		
		
		Matcher m=p.matcher(str);
		
		if(m.find())
		{
			System.out.println("Pattern Found");
		}
Pattern p1=Pattern.compile("\\d\\d");//to find two digit
		
		
		Matcher m1=p1.matcher(str);
		
		while(m1.find())
		{
			System.out.println(m1.group());
		}

	}
}
