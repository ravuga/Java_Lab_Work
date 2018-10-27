interface Shape
{
	//String color{} //error, since method is not declared default

	static void color()
	{
		System.out.println("Color of Given Circle is Red");	
	}
	double area();
}

class Circle implements Shape
{
	double radius=16.2;
	public double area()
	{
		return(3.14*radius*radius);
	}
}

class Test
{
	public static void main(String args[])
	{
		Circle c= new Circle();
		System.out.println("Area of Circle of Given Radius is "+c.area());
		//c.color();
		Shape.color();
	}
}