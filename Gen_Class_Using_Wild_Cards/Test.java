import java.util.*;
class Gen<T extends Number>
{
	T numObject;
	Gen(T ob)
	{
		numObject=ob;
	}
	boolean compare(Gen<?> obj2)
	{
		if(numObject.doubleValue()==obj2.numObject.doubleValue())
			return true;
		else
			return false;
	}
}
class Test
{
	public static void main(String args[])
	{
		Gen<Integer> obj1= new Gen<Integer>(20);
		Gen<Double> obj2= new Gen<Double>(15.8);
		boolean flag=obj1.compare(obj2);
		if(flag==false)
			System.out.println("Value differ");
		else
			System.out.println("BOth values are Equal");	
	}
}

