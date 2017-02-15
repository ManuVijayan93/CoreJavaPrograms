
class SingleTonDemo
{
	private static SingleTonDemo obj=new SingleTonDemo();

	private SingleTonDemo()
	{}

	public static SingleTonDemo getInstance()
	{
	return obj;
	}
	public void shareResource()
	{
	System.out.println("Sharing Resource");
	}
}