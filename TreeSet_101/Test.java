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
		
		Iterator<String> itr=tree.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
	}
	
}


