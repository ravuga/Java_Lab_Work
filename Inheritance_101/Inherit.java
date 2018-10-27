import java.util.Scanner;
//Q.CREATE A PERSON CLASS HAVING FIELD name, age and display(). NOW CREATE A STUDENT CLASS EXTENDING PERSON CLASS HAVING FIELDS regno, display().(Note that display
//method defination is changed in student class.).NOW CREATE A EMPLOYEE CLASS EXTENDING PERSON CLASS HAVING FIELDS company,salary and display().(Note that display
//method defination is changed in employee class.) 

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

class Employee extends Person
{
	String company;
	int salary;
	Employee()
	{
	//Default Constructor
	}
	Employee(String name,int age,String company,int salary)
	{	
		this.name=name;
		this.age=age;
		this.company=company;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);	
		System.out.println("Company "+company);
		System.out.println("Salary "+salary);		
	}

}

class Demo
{
	public static void main(String args[])
	{
                Scanner s1= new Scanner(System.in);
                System.out.println("Enter The Name ");
                String a=s1.nextLine();
                System.out.println("Enter The Age ");
                int b=s1.nextInt();
                System.out.println("Enter The Company ");
                String c= s1.nextLine();
                System.out.println("Enter The Salary ");
                int d=s1.nextInt();
		Person p= new Person(a,b);
		Student s=new Student(a,b,11602103);
		Employee e= new Employee(a,b,c,d);
		p.display();
		System.out.println("///////////////////////////////");
		s.display();
		System.out.println("///////////////////////////////");
		e.display();
		System.out.println("///////////////////////////////");
	}
}