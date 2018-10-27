class Test{
	public static void main(String args[])
	{
		StringBuilder s= new StringBuilder("Hello");
		System.out.println(s.capacity());
		s.append("World");
		System.out.println(s);
		s.ensureCapacity(50);
		System.out.println(s.capacity());
		s.replace(0,5,"Bonjour ");
		System.out.println(s);				
	}
}
