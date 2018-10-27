import java.util.*;
class Rectangle
{
	int length,breadth;
	Rectangle(int x,int y)
	{
		length=x;
		breadth=y;
	}
	int area()
	{
		return length*breadth;
	}
	int perimeter()
	{
		return 2*(length+breadth);
	}
}
//Implementing Custom Comparator 
class RectangleComparator implements Comparator<Rectangle>
{
	public int compare(Rectangle x,Rectangle y)
	{
		int area1=x.area();
		int area2=y.area();
		if(area1<area2)
			return +1;
		else if(area2<area1)
			return -1;
		else
			return 0;
	}
}
class Test
{
	public static void main(String args[])
	{
		TreeSet<Rectangle> tree=new TreeSet<Rectangle>(new RectangleComparator());
		tree.add(new Rectangle(4,4));
		tree.add(new Rectangle(4,5));
		tree.add(new Rectangle(12,4));
		System.out.println("Sorted in Decreasing Order in terms of Area ");
		int k=1;
		for(Rectangle i:tree)
		{
			System.out.println("Area of Rectangle "+k+" is "+i.area());
			k++;
		}
	}
}

