interface Drawable
{
	public void draw(int S,float Q,double T);
}

class Test 
{
	public static void main(String args[])
	{	
		Drawable d=(int S,float Q,double T)->{
			System.out.println("Value of S (Integer) is "+S);
			System.out.println("Value of Q (Float) is "+Q);
			System.out.println("Value of T (Double) is "+T);
				};
		d.draw(18,174,18.99634);
	}
}