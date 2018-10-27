interface Drawable
{
	public void draw(int S);
}

class Test 
{
	public static void main(String args[])
	{	
		Drawable d=(int S)->{
			System.out.println("Value of S is "+S);
				};
		d.draw(18);
	}
}