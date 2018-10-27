import java.util.*;
class Student
{
	int roll_no;
	String name;
	Student(String name, int roll_no)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	void display()
	{
		System.out.println("Name of Student is "+name+" Roll no is "+roll_no);
	}
}
//Implementing Custom Comparator 
class StudentComparator implements Comparator<Student>
{
	public int compare(Student x,Student y)
	{
		if(x.roll_no<y.roll_no)
			return +1;
		else if(x.roll_no>y.roll_no)
			return -1;
		else
			return 0;
	}
}
class Test
{
	public static void main(String args[])
	{
		TreeSet<Student> tree=new TreeSet<Student>(new StudentComparator());
		tree.add(new Student("A",14));
		tree.add(new Student("B",19));
		tree.add(new Student("C",57));
		System.out.println("Sorted in Decreasing Order");
		for(Student i:tree)
		{
			i.display();
		}
	}
}

