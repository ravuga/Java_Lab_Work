import java.util.*;
class Test
{
	public static void main(String args[])
	{
		//Create A HAsh map
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(11250,"A");
		hashMap.put(11210,"B");
		hashMap.put(26250,"C");
		hashMap.put(89250,"D");
		
		System.out.println("Display entries in HashMap are ");
		System.out.println(hashMap+"\n");
		System.out.println("Entry Set "+hashMap.entrySet());
		System.out.println("Key Set "+hashMap.keySet());
		System.out.println("Values "+hashMap.values());
		hashMap.put(99999,"F");
		System.out.println("Adding F,99999 \n"+hashMap);
		hashMap.remove(99999);
		System.out.println("Removing F,99999 \n"+hashMap);
		if(hashMap.containsKey(11210))
		{
		   System.out.println("Value of 11210 is "+hashMap.get(11210));			
		}
		if(hashMap.containsValue("B"))
		{
		   System.out.println("Value of B is There");			
		}					
		if(hashMap.containsKey(11210))
		{
		   hashMap.put(11210,"G");			
		} 
		System.out.println("Is G is Added? \n"+hashMap);
		System.out.println("Size of Hash Map is "+hashMap.size());	
		hashMap.clear();
		System.out.println("hashMap is Empty...?"+hashMap.isEmpty());
	}	
}
