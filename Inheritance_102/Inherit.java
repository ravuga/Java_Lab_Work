import java.util.*;
//Q.CREATE A PERSON CLASS HAVING FIELD name, age and display(). NOW CREATE A STUDENT CLASS EXTENDING PERSON CLASS HAVING FIELDS regno, display().(Note that display
//method defination is changed in student class.).Store AT LEAST 3 RECORDS OF STUDENTS IN A ARRAYLIST. nOW USE A SEARCH FUNCTION BASED ON REGNO TO FIND THE RECORD.

class Person
{
	String name;
	int age;
	Person()
	{
	//Default Constructor
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);	
	}
}
class Student extends Person
{
	int regno;
	Student()
	{
	//Default Constructor
	}
	Student(String name,int age,int regno)
	{
		this.name=name;
		this.age=age;
		this.regno=regno;
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);	
		System.out.println("Registration No. "+regno);		
	}
}
class Test
{
	public static void search(int regNo)
	{
		for(Student s: obj)
		{
			if(s.regno==regNo)
			{
			s.display();
			return;
			}
		}
		System.out.println("Record not found");	
	}
	static ArrayList<Student> obj=new ArrayList<Student>();
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Test  t = new Test();
		Student s1= new Student("A",19,15749);
		Student s2= new Student("B",17,17549);
		Student s3= new Student("C",18,14985);	
		obj.add(s1);obj.add(s2);obj.add(s3);
		System.out.println("Enter UID to search for record ");
		int regNo=sc.nextInt();
		t.search(regNo);
	}	
}