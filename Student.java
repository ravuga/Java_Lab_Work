class Student
{
	int rollno;
	String name;
	void getRollno(int r)
	{
		rollno=r;		
	}
	void getName(String n)
	{
		name=n;	
	}
	void displayInformation()
	{
		System.out.println("Roll No is "+ rollno +" "+ "Name is "+ name);
	}
}
