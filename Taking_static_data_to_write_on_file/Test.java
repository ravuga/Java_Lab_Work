import java.io.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fout=null;
		try{
			fout=new FileOutputStream("C:/Users/xixeon/Desktop/user.txt");
			String str=new String("This is my user data");
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