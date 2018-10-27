import java.util.Scanner;
class forEach
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
			int sum=0;
			for(int k:c){
				sum=sum+k;				
			}
			System.out.println("Sum is "+sum);	
		}
}


// Generally this loop is used to traverse the collection or array given.It cannot be used to take inputs directly.
