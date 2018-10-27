//WAP to create Student class having field : name , class and marks[].And it should also methods: void setDetails(-,-,-) and void Display()
//Make seprate class having main(). Make two student objects and enter their details and display their info.Plus create the array of student of size where n will be entered by user.//

//Here same object is overwritten.
import java.util.Scanner;
class multistudentData
{
	
		public static void main(String args[])
		{
		System.out.print("Enter the number of Students ");
		Scanner sc1= new Scanner(System.in);		
		int k= sc1.nextInt();
		while(k!=0)
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
				k--;
			}
				
		}
}

