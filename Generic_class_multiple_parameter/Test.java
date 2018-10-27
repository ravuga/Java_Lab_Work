import java.util.*;
class Gen<T1,T2>
{
	T1 obj1;
	T2 obj2;
	Gen(T1 ob1,T2 ob2)
	{
		obj1=ob1; 
		obj2=ob2;
	}
	T1 getObject1()
	{
		return obj1;
	}
	T2 getObject2()
	{
		return obj2;
	}
}
class Test
{
	public static void main(String args[])
	{
		Gen<String,Integer> object1=new Gen<String,Integer>("Hello",35);
		System.out.println(object1.getObject1());
		System.out.println(object1.getObject2());
			
	}
}

