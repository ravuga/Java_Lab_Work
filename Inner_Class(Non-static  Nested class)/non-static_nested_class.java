class Test
{
	public static void main(String args[])
	{
		Outer out=new Outer();			//creating object of nested class
		Outer.Inner inn=out.new Inner();	//calling the function of nested class
		inn.display();
	}

}


class Outer
{
	int outVar=100;
	class Inner		//non-static inner class(Inner Class)
	{
		public void display()	
		{
			System.out.println("This is a nested class function");
			outVar=100;
		}
	}
}