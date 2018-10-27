abstract class Shape
{
	abstract double area();
	abstract double perimeter(); 
}

class Circle
{
	double radius;
	
	Circle(double radius)
	{
		this.radius=radius;	
	}
	
	double area()
	{
		return (3.14 * radius * radius);
	}
	
}

class Test
{
	public static void main(String args[])
	{
		Circle c= new Circle(15.0);
		double a=c.area();
		System.out.println("Area : "+ a);
	}

}
