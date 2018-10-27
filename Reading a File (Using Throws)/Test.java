import java.io.*;
class Test
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("First I/O Program");
		// this can generate a checked exception so it will need try catch block.
		FileInputStream input1=null;
		try{	
		input1=new FileInputStream("C:/Users/xixeon/Desktop/t.txt");
		int k=0;
		while(k!=-1)
		{
			k=input1.read();
			if(k!=-1){
					System.out.print((char)k);
			         }
		}			
		}catch(IOException e)
		{
			System.out.println("Error while reading a file");
		}finally{
			if(input1!=null)
			input1.close();
				
		}
	}
}