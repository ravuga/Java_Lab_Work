/*
Serialization :- Writing object onto a file
De-serialization :-  Reading object from a file
*/

import java.io.*;
import java.util.*;
public class Test
{
	public static void main(String args[]) throws IOException
	{
		
		try{
			MyClass obj= new MyClass("Hello Sir",-7,2.7e10);
			System.out.println("Object: "+ obj);
			FileOutputStream fos=new FileOutputStream("C:/Users/xixeon/Desktop/t.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			fos.close();
		   }catch(IOException e)
		      {
				System.out.println("Exception during Serialization: "+e);
		      }
		System.out.println("Seralization DOne");
		
		try{
			MyClass obj1;
			FileInputStream fis=new FileInputStream("C:/Users/xixeon/Desktop/t.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			obj1=(MyClass)ois.readObject();
			ois.close();
			System.out.println("Object: "+obj1);
		   }catch(Exception e)
		      {
				System.out.println("Exception during Serialization: "+e);		
		      }	
		System.out.println("De-Seralization DOne");
		System.exit(0);
	}
}

class MyClass implements Serializable
{
	String s;
	int i;
	double d;
	public MyClass(String s,int i,double d)
	{
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public String toString()
	{
		return "s="+s+";i="+i+";d="+d;
	}
}