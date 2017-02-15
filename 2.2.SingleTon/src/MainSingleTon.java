
public class MainSingleTon
{
	public static void main(String arg[])
	{
	SingleTonDemo obj=SingleTonDemo.getInstance();
	obj.shareResource();
	}
}