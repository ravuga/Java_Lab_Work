class Overflowp
{
	public static void main(String args[])
	{
		int a=130;
		byte b=(byte)(a);
		//byte c=185;  Possible lossy conversion from byte in int//
		System.out.println(a);
		System.out.println(b);
		
	}
}