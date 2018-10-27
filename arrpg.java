//WAP to create Student class having field : name , class and marks[].And it should also methods: void setDetails(-,-,-) and void Display()
//Make seprate class having main(). Make two student objects and enter their details and display their info.

//import java.lang.* //By default imported by Java


class arrpg
{
	int rollno;
	String name;
	int marks[] = new int[5];
	void setDetails(int r, String n, int m[])
	{
		rollno=r;
		name = n;
		marks=m;
	}
	void display()
	{	System.out.print("/////////////////////////////////////////////\n");
		System.out.println("Roll No is "+ rollno +"\n"+ "Name is "+ name);
		for(int i=0;i<5;i++)
		{
				System.out.println("Marks for "+ i +" subject is "+ marks[i]);	
		}
		System.out.print("*********************************************\n");
	}
}
