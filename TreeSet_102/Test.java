import java.util.*;
class Test
{
	public static void main(String args[])
	{
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("A");
		tree.add("b");
		tree.add("c");
		tree.add("d");
		tree.add("E");
	
		if(!tree.contains("G"))
			tree.add("G");
	
		System.out.println("is Tree Empty? "+tree.isEmpty());
		System.out.println("Elements are "+tree);
		
		tree.remove("c");

		System.out.println("First Element is "+tree.first());
		System.out.println("Last Element is "+tree.last());
		System.out.println("Size of TreeSet is "+tree.size());
	
		Iterator<String> itr=tree.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		tree.clear();
		System.out.println("Final TreeSet is Empty..? "+tree.isEmpty());
	}
}

