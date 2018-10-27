import java.util.Scanner;
enum Sch{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
class Schedule{
	public static void main(String args[])
	{
		Scanner s1= new Scanner(System.in);
		Sch s=Sch.valueof(nextLine());
		switch(s)
		{	
			case MONDAY: 
			System.out.println("DEBUG");
			break;
			case TUESDAY: 
			System.out.println("COMPILE");
			break;
			case WEDNESDAY: 
			System.out.println("EXECUTE");
			break;
			case THURSDAY: 
			System.out.println("COMMENT");
			break;
			case FRIDAY: 
			System.out.println("INDENTATION");
			break;
			case SATURDAY: 
			System.out.println("HOLIDAY");
			break;
			case SUNDAY: 
			System.out.println("HOLIDAY");
			break;
										



		}	
		
	}

}
