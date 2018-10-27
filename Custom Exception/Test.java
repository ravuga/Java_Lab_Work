/*Creating Custom Class (User Defined Exception)
We can create own Exception sub-class by inheriting Exception class or Throwable Class.
The Exception class does not define any method of its own
*/
import java.util.Scanner;
class Except101 extends Throwable
{
	public Except101(String s)
	{
		System.out.println("You Entered "+s);
	}
}
	 
class Test
{
	public static void main(String args[])
	{
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name ");
		String s1=sc.nextLine();
		if(s1.equals("Chamma"))
		{
			throw new Except101(s1);
		}
		System.out.println("Good Name");	
		}catch(Except101 e)
		{
			System.out.println("She is cute");
		}
	}
}