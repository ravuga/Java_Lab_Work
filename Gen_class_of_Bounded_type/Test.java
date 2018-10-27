import java.util.*;
class Gen<T extends Number>
{
	T[] nums;
	Gen(T[] o)
	{
		nums=o;
	}
	double average()		
	{
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
}
class Test
{
	public static void main(String args[])
	{
		Integer a[]={1,2,3,5,9,6};
		Gen<Integer> obj1= new Gen<Integer>(a);
		System.out.println("Average is: "+obj1.average());
		
		Double d[]={1.5,2.6,3.4,5.2,9.7,6.1};
		Gen<Double> obj2= new Gen<Double>(d);
		System.out.println("Average is: "+obj2.average());	
	}
}

