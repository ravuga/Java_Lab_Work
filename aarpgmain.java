import java.util.Scanner;
class aarpgmain
{
	
		public static void main(String args[])
		{
		int c[]=new int[5];	
		Scanner sc= new Scanner(System.in);
		arrpg s1= new arrpg();
		System.out.print("Enter Roll no ");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name ");
		String b=sc.nextLine();
		for(int i=0;i<5;i++)
		{
		System.out.print("Enter marks for "+(i+1)+" subject ");	
		c[i]=sc.nextInt();
		}
		s1.setDetails(a,b,c);
		s1.display();
		}
}

