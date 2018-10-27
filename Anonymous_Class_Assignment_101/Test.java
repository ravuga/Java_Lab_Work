//create an interface Colors having the method : void showColor()
//Implement the method of this interface using anonymous class object and invoke it.

//Now create 3 anonymous class object and pass them one-by-one to a method called display() which will invoke the overriden methods of anonymous class objects.

abstract interface Colors
{
	public abstract void showColor();
}

class Test
{
	static void display(Colors c)	
	{
		c.showColor();
	}
	
	public static void main(String args[])		
	{
		Colors c=new Colors(){
					public void showColor()
					{
					 System.out.println("Color is Yellow");
					}
					};
		c.showColor();

		Colors c1=new Colors(){
					public void showColor()
					{
					 System.out.println("Color is Red");
					}
				};
		Colors c2=new Colors(){
					public void showColor()
					{
					 System.out.println("Color is Green");
					}
				};
		Colors c3=new Colors(){
					public void showColor()
					{
					 System.out.println("Color is Black");
					}
				};
		display(c1);
		display(c2);
		display(c3);
	}
}