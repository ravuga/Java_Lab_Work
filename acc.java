//wap to create a joint account of 2 persons in the bank having field: amount and void display() method and void deposit(int amount) methods. Create 2 person objects in which first person deposits the money and other person display the balance information.
import java.util.Scanner;
class jointAccount
{	
	static int amount;
	static void display()
	{
		System.out.println("Available Amount is "+amount);
	}
	void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Amount desposited "+amount);		
	}
	public static void main(String args[])
	{	
		int choice;	
		System.out.println("Welcome to Xbankers ");
		jointAccount A1= new jointAccount();
		jointAccount A2= new jointAccount();
		do{		
		System.out.println("Choose the Option below.");
		System.out.println("1.Display the Available Amount in the Joint Account ");
		System.out.println("2.Deposit in the Joint Account");
		System.out.println("3.Exit ");
		Scanner sc1= new Scanner(System.in);
		choice= sc1.nextInt();
		if(choice==1)
		{
			A2.display();		
		}
		else if(choice==2)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Amount ");
			A1.deposit(sc.nextInt());		
		}
		else if(choice==3)
		{
			System.out.println(" Thank you for banking with us. We are happy to help you. ");
			System.exit(0);		
		}
		}while(choice==1||choice==2||choice==3);
	}

}
