import java.util.Scanner;
class arrclone
{
	public static void main(String args[])	
		{
			Scanner sc= new Scanner(System.in);
			int c[]=new int[5];
			for(int i=0;i<5;i++)
			{
			System.out.print("Enter a Number ");
			c[i]=sc.nextInt();
			}
			int d[];
			d=c.clone();
			for(int j=0;j<5;j++)
			{
			System.out.println(d[j]);
			}	
		}
}

