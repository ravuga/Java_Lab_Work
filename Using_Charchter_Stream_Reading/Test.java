import java.io.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=null;
		try{
			fr=new FileReader("C:/Users/xixeon/Desktop/result.txt");
			int c=0;
			while(c!=-1){
				c=fr.read();
				System.out.print((char)c);
			}
			}catch(IOException e)
			{
				System.out.println("Error in wriiting the file");		
			}finally
			{
				if(fr!=null)
				fr.close();	
			}
	}
}