
public class PremierCustomer extends Customer {
	int discount;

	public PremierCustomer()
	{
	custid=1001;		//inherited Properties
	custname="Harish";		//Inherited Properties
	discount=90;
	}

	public void displayDetail()
	{
	System.out.println("Customer ID:"+custid);
	System.out.println("Customer Name:"+custname);
	System.out.println("Customer discount:"+discount);
	}

	public static void main(String arg[])
	{
	PremierCustomer obj1=new PremierCustomer();

	obj1.displayDetail();
	}

}
