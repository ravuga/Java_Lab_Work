//WAP TO CREATE STUDENT CLASS HAVING THE FIELDS : name and age and display() method. Make 2 student objects , intialize 1 object with default constructor and other with parameterized constructor and display the info of the both object
//{constructors,static keyword and this keyword }

class Student
{
	String name;
	int age;
	Student()
	{
		name="Shurti";
		age=14;
	}
	Student(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.print("Name "+name+"\nAge "+age);
	}

	public static void main(String args[])
	{
		System.out.print("Enter the details \n");	
		Student s1= new Student("Gaurav",15);
		Student s2= new Student();
		s1.display();
		System.out.print("\n");
		s2.display();
		System.out.print("\n");
			
	}

}

