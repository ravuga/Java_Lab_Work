class StudentInfo
{
	public static void main(String args[])
	{
		Student s1= new Student();
		Student s2= new Student();
		s1.getRollno(1);
		s2.getRollno(2);
		s1.getName("Aakash");
		s2.getName("Yamini");
		s1.displayInformation();
		s2.displayInformation();		
	}	
}
