import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		try{
		int c=5/3;
		if(4>1)
		{
			System.out.println("Quiting try Block");
			return;	
		}
			System.out.println("Hello World");
		}catch(ArithmeticException a)
		{
			System.out.println("Divide by Zero Exception.");
		}finally
		{
			System.out.println("Final Block Executed");	
		}
	}
}