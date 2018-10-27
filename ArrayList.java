import java.util.ArrayList;
class Demo
{
	public static void main(String args[])
	{
		ArrayList<String> s1=new ArrayList<String>();
		ArrayList<String> s2=new ArrayList<String>(18);
		ArrayList<String> s4=new ArrayList<String>();		
		//Adding element in the ArrayList		
		s1.add("Apple");
		s1.add("Mango");
		System.out.println("Array List 1 "+s1);
		//Adding element at specific index in the ArrayList
		s1.add(1,"Banana");
		System.out.println("Added a new element in Array List 1 "+s1);
		//Adding all elements into a new ArrayList
		s2.addAll(s1);
		System.out.println("addAll function to copy all elements of ArrayList 1 to new ArrayList 2 "+s2);
		//Removing a specific element from a new ArrayList using Index
		s2.remove(1);
		System.out.println("Removed index 1 of Array List 2 "+s2);
		//Creating new ArrayList using existing one
		ArrayList<String> s3=new ArrayList<String>(s1);	
		System.out.println("Creating new ArrayList 3 using Arraylist 1"+s3);
		//Adding all elements at specific index into a new ArrayList 
		s3.addAll(1,s1);
		System.out.println("addAll function to copy all elements of ArrayList 1 to index 1 of new ArrayList 3"+s3);
		//clear function
		s3.clear();
		System.out.println("Array list 3 is cleared "+s3);
		//
	}

}
