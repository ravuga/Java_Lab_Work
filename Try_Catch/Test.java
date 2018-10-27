import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		try{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		a=sc.nextInt();
		System.out.println("Enter B");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Value of c is "+c);
		}catch(ArithmeticException a)
		{
			System.out.println("Divide by Zero Exception.");
		}finally
		{
			System.out.println("Thank You");	
		}
	}
}