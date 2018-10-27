import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Deque<String> obj= new LinkedList<String>();
		obj.offer("A");obj.offer("B");obj.offer("C");obj.offer("E");obj.offer("F");
		System.out.println(obj);
		obj.offerFirst("Z");
		obj.offerLast("T");
		System.out.println(obj);
		obj.poll();
		System.out.println(obj);
		obj.offerFirst("Z");
		obj.pollFirst();
		obj.pollLast();
		System.out.println(obj);
		System.out.println(obj.peek());
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());
	}
}
