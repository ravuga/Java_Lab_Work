abstract interface Bank
{
	float rateOfInterest();	
}

class PNB implements Bank
{
	public float rateOfInterest()
	{
		return 9.5f;
	}
}

class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 5.5f;
	}
}


class Test
{
	public static void main(String args[])
	{
		Bank b1= new SBI();	
		Bank b2= new PNB();
		System.out.println("rate of interest of SBI is "+b1.rateOfInterest());
		System.out.println("rate of interest of SBI is "+b2.rateOfInterest());	
	}

}