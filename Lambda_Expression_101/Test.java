interface Drawable
{
	public void draw();
}

class Test
{
	public static void main(String args[])
	{
		int w=100;
		
		Drawable d=()->{
			System.out.println("W is "+w);
				};
		d.draw();
	}
}