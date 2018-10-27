import java.util.Scanner;
import java.*;
class Ball{
	void display()
	{
		return;	
	}
}
class Test
{
	public static void main(String args[])
	{
		try{
		int a[]=new int[5];
		a[7]=9/0;
		}catch(ArithmeticException a)
		{
			System.out.println("Divide by Zero Exception.");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds");
		}catch(Exception e)
		{
			System.out.println("Error Occured");
		}
	}
}