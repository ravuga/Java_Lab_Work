import java.io.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try{
			fin=new FileInputStream("C:/Users/xixeon/Desktop/t.txt");
			fout=new FileOutputStream("C:/Users/xixeon/Desktop/u.txt");
			int c=0;
			while(c!=-1)
				{
					c=fin.read();
						if(c==-1)
						{
							break;
						}
					fout.write(c);
				}
			}catch(IOException e)
			{
				System.out.println("Error in copying the file");		
			}finally
			{
				if(fin!=null)
				fin.close();
				if(fout!=null)
				fout.close();	
			}
		System.out.println("COpying Done");	
	}
}