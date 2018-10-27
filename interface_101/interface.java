abstract interface Shape
{
	public static final String colour="Yellow";
	public abstract void colour();
}

class Circle implements Shape
{
	public void colour()
	{
		System.out.println("Circle is "+colour+" colour.");
	}
}

class Test
{
	public static void main(String args[])
	{
		Circle c= new Circle();
		c.colour();	
	}
}