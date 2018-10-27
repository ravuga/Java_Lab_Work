//Reading Half of the file.
import java.io.*;
 
public class Test
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:/Users/xixeon/Desktop/Ja/test.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input); 
        String line;
	int characterCount = 0;
        while((line = reader.readLine()) != null)
        {
            if(!(line.equals("")))
            {
                characterCount += line.length();
            }
        } 
	FileReader fr=null;
	try{
		fr=new FileReader("C:/Users/xixeon/Desktop/Ja/test.txt");
		int c=0;
		for(int i=1;i<=(characterCount/2)&&c!=-1;i++)
		{	
			c=fr.read();
			if(c==-1){
				break;
			}
			System.out.print((char)c);
		}
	}catch(IOException e)
	{
		System.out.println("Error");
	}finally{
			fr.close();
		}
        System.out.println("\nTotal number of Characters in the file were = " + characterCount);
    }
}


/*
	for(int i=1;i<=(characterCount/n)&&c!=-1;i++) for nth part
	for(int i=1;i<=k&&c!=-1;i++) for k charchters
*/