import java.util.Scanner;
class Multiarr
{
	public static void main(String args[])	
		{
			Scanner sc= new Scanner(System.in);
			int c[][]=new int[3][3];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
					{
				System.out.print("Enter c["+(i+1)+"]"+"["+(j+1)+"] ");
						c[i][j]=sc.nextInt();
					}
			}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
				System.out.print("\n");	
			}
			System.out.println("\n Enter the search number ");
			int search=sc.nextInt();
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
					{
						if(c[i][j]==search)
						{
							System.out.println("Found at Row "+(i+1)+" Column "+(j+1));
							break;
						}
					}
			}
				
		}
}

