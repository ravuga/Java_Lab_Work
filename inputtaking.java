import java.util.Scanner;
class inputtaking
{
	public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Int: ");
			int a= s.nextInt();
			
			System.out.print("Enter Double: ");
			double b= s.nextDouble();
			
			System.out.print("Enter Word: ");
			String c= s.next();

			System.out.print("Enter String: ");
			s.nextLine();
			String d= s.nextLine();
			
			System.out.print("Enter Boolean: ");
			//s.nextLine();
			boolean e=s.nextBoolean();
			
			System.out.print("Enter Byte ");
			byte f=s.nextByte();
			
			System.out.println("Integer "+a);
			System.out.println("Double "+b);
			System.out.println("Word "+c);
			System.out.println("String "+d);
			System.out.println("Boolean "+e);
			System.out.println("Byte "+f);
		}
}
