import java.io.*;
import java.util.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fout=null;
		try{
			fout=new FileOutputStream("C:/Users/xixeon/Desktop/user.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Credentials");
			String str=sc.nextLine();
			byte b[]=str.getBytes();
			for(int i=0;i<b.length;i++)
				{
					fout.write(b[i]);	
				}
			}catch(IOException e)
			{
				System.out.println("Error in wriiting the file");		
			}finally
			{
				if(fout!=null)
				fout.close();	
			}
		System.out.println("Entry Done");	
	}
}