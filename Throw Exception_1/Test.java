import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a positive Integer Number ");
			int val=sc.nextInt();
			if(val<0)
			{
				IllegalArgumentException obj=new IllegalArgumentException();
				throw obj;
				//throw new IllegalArgumentException();
			}else
			{
				System.out.println("Number entered is Positive");
			}
		}catch(IllegalArgumentException e)
		{
			System.out.println("Value entered is negative....");
		}
	}
}