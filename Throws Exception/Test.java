import java.util.Scanner;
import java.io.*;


class Test
{
	public static void main(String args[])
	{
		try{
		check();
		}catch(IOException e)
		{
			System.out.println("No File Found");
		}
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