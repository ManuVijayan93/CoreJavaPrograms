package com.overloading;

class BoxOverload
{
	float width,height,depth;

	public BoxOverload()	
	{
	width=18;
	height=9;
	depth=6;
	}

	public BoxOverload(float val)	
	{	
	width=height=depth=(val>0)?val:1;
	}

	public BoxOverload(float w,float h,int d)	
	{
	width=15;
	height=15;
	depth=15;
	}

	public float volume()
	{
	return width*height*depth;
	}

	public static void main(String arg[])
	{
	BoxOverload obj=new BoxOverload();
	BoxOverload obj2=new BoxOverload(10);
	BoxOverload obj3=new BoxOverload(11,12,13);

	System.out.println("Default Box Volume:"+obj.volume());
	System.out.println("Square Box Volume:"+obj2.volume());
	System.out.println("User Defined Box Volume:"+obj3.volume());
	
	}

}