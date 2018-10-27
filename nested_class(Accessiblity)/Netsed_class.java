class Outer
{
		void outerDisplay()
			{
			Inner inn=new Inner();
			inn.nestedDisplay();
			Nested nest =new Nested();
			nest.innerDisplay();
			}

	class Inner		//non-static nested class
	{
		void nestedDisplay()
		{
			System.out.println("Inner Function ");
		}
	}

	static class Nested	//static nested class
	{
		void innerDisplay()
		{
			System.out.println("Nested Function");	
		}
	}

}

class Test
{
	public static void main()
	{
		Outer out=new Outer();
		out.outerDisplay();
	}
}