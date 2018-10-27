import java.util.Scanner;
import java.io.*;


class Test1
{
	public static void main(String args[]) throws IOException
	{
		//Here main is also not taking responsiblity that implies throwing exception.That is compile saved but
		// not runtime saved. This results in termination of the program impling bad programming.
		check();
	}
	static void check() throws IOException  
	{
		// That particular exception can occur but it cannot be catched.That implies responsibility of handling
		// the exception goes to caller which is here is main method. 
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Age");
			int val=sc.nextInt();
			if(val<18)
			{
				FileInputStream	fp = new FileInputStream("C:/z.txt");	
			}

	}
}