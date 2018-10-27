class Shape
{
	void show()
	{
		System.out.println("Parent Show Method");
	}
}

class Test
{
	public static void main(String args[])
	{
		Shape s= new Shape(){  	
					//Anonymous Class 

					void show()
					{
					  System.out.println("Child Show Method");	
					}
					void fun()
					{
					 System.out.println("Child Show Method_1");
					}	
				    };
		s.show();
		s.fun();
				//calling the overridden Function
		System.out.println("OutSide The Anonymous Class");
	}
}