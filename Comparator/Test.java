import java.util.*;

class MyComp implements Comparator<String>
{
	public int compare(String astr,String bstr)
	{
		return bstr.compareTo(astr); //Reverse the comparison
	}
	//No need of overiding equals method or the default method is enough (Inherited from object class)
}



class Test
{
	public static void main(String args[])
	{
		TreeSet<String> tree=new TreeSet<String>(new MyComp());
		tree.add("A");
		tree.add("b");
		tree.add("c");
		tree.add("d");
		tree.add("E");
	
		if(!tree.contains("G"))
			tree.add("G");
	
		for(String elements: tree)
			System.out.println(elements +" ");	
		System.out.println();
	}
}

