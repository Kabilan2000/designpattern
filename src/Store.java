import java.util.*;
class Store implements Subject   {
     
	ArrayList<customer> customers;
	String name;
	int price;
	Store()
	{
		customers=new ArrayList<customer>();
	}
	
	
	@Override
	public  void addCutomer(customer cus)
	{
		if(customers!=null)
		{
			customers.add(cus);
		}
	}
	
	@Override
	public void notifyAllCutomers()
	{
		for(Observer cus:customers)
		{
			cus.update();
		}
	}
	
	@Override
	public  void removeCutomer(Observer cus)
	{
		if(customers!=null)
		{
			customers.remove(cus);
		}
	}
	
	
	@Override
	public void upDateProduct(String name,int price)
	{
		this.name=name;
		this.price=price;
		notifyAllCutomers();
	}
}
