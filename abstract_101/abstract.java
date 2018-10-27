abstract class Person{
	String name;
	int age;
	abstract void calculate();
}

class Student extends Person
{
	int regno;
	String dept;
	void calculate()
	{
		System.out.println("Your marks are being evaulated");	
	}
	void show()
	{
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("Reg No. is : "+regno);
		System.out.println("Dept is : "+dept);	
	}
}

class Test
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.name="Satinder";
		s.age=19;
		s.regno=11620535;
		s.dept="CSE";
		s.show();
		s.calculate();	
	}

}