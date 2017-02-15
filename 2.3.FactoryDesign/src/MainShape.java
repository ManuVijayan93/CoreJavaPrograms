
public class MainShape
{
	//Factory Method
	public static Shape getShape(String shape_name)
	{
		Shape ob=null;

		if(shape_name.equals("Rectangle"))
		{
		ob=new Rectangle();
		}
		if(shape_name.equals("Triangle"))
		{
		ob=new Triangle();
		}

		return ob;	
	}
	public static void main(String arg[])
	{	
		Rectangle ob=(Rectangle) MainShape.getShape("Rectangle");
		System.out.println("Area is :"+ob.area());
	}
}