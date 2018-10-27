import java.util.Scanner;

abstract interface Shape
{
	Scanner sc= new Scanner(System.in);
	public static final String colour=sc.nextLine();
	public abstract void colour();
}

class Circle implements Shape
{
	public void colour()
	{
		System.out.println("Enter the colour ");
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