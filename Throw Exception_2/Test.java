import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		check();
	}
	static void check()
	{
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Age");
			int val=sc.nextInt();
			if(val<18)
			{
				IllegalArgumentException obj=new IllegalArgumentException();
				throw obj;
				//throw new IllegalArgumentException();
			}else
			{
				System.out.println("VAlid Voter");
			}
		}catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Voter");
		}

	}
}