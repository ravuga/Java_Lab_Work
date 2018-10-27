import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Your Age ");
		int val=sc.nextInt();
		assert val>=18:"Not a Valid Age";
		System.out.println("Entered Age is "+val);
	}
}

//Run by java -ea <Filename>
//Run by java -enableassertions <Filename>