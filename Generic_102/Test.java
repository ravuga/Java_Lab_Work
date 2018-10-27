import java.util.*;
class G<T1,T2>
{
	T1 obj1;
	T2 obj2;
	G(T1 obj1,T2 obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;	
	}
	T1 getobj1()
	{
		return obj1;
	}
	T2 getobj2()
	{
		return obj2;
	}
}
class Test
{
	public static void main(String args[])
	{
	G<String,Integer> obj=new G<String,Integer>("Hello",35);
	System.out.println(obj.getobj1());
	System.out.println(obj.getobj2());
	}

/*	G<> obj=new G<>();
	obj.set();
	System.out.println(obj.get());
*/
}