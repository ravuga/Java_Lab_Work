//WAP to create Student class having field : name , class and marks[].And it should also methods: void setDetails(-,-,-) and void Display()
//Make seprate class having main(). Make two student objects and enter their details and display their info.Plus create the array of student of size where n will be entered by user.//
import java.util.Scanner;
class multiStudentData
{
	
		public static void main(String args[])
		{
		System.out.print("Enter the number of Students ");
		Scanner sc1= new Scanner(System.in);		
		int k= sc1.nextInt();
		multiStudent s1[] = new multiStudent[k];		
		for(int j=0;j<k;j++){
				System.out.print("Enter The Student"+(j+1)+" details "+"\n");
				//Creation of objects
				s1[j] = new multiStudent(); 
				//Getting Temporary Data
				int c[]=new int[5];	
				Scanner sc= new Scanner(System.in);
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
				s1[j].setDetails(a,b,c);
				}
			for(int r=0;r<k;r++){
				System.out.println("Details of Student "+(r+1)+"....\n");
				s1[r].display();
				}
		}
}

