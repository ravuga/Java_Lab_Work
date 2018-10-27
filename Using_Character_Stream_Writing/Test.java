import java.io.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		FileWriter fw=null;
		try{
			fw=new FileWriter("C:/Users/xixeon/Desktop/result.txt");
			char c[]={'a','g','c'};
			for(int i=0;i<c.length;i++)
			fw.write(c[i]);
			}catch(IOException e)
			{
				System.out.println("Error in wriiting the file");		
			}finally
			{
				if(fw!=null)
				fw.close();	
			}
		System.out.println("Entry Done");	
	}
}