class G<T>
{
	T s;
	void set(T s)
	{
		this.s=s;	
	}
	T get()
	{
		return s;
	}
}
class Test
{
	public static void main(String args[])
	{
	G<Integer> obj=new G<Integer>();
	obj.set(15);
	System.out.println(obj.get());

	G<Float> obj1=new G<Float>();
	obj1.set(12f);
	System.out.println(obj1.get());

	G<String> obj2=new G<String>();
	obj2.set("It's !6th April baby");
	System.out.println(obj2.get());
	
	G<Boolean> obj3=new G<Boolean>();
	obj3.set(true);
	System.out.println(obj3.get());
	}

/*	G<> obj=new G<>();
	obj.set();
	System.out.println(obj.get());
*/
}