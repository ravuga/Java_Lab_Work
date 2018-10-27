import java.io.*;
class Test
{
	public static void main(String args[])
	{
		File f=new File("C:/Users/xixeon/Desktop/theory.txt");
		System.out.println("Filename : "+f.getName()); //name of file
		System.out.println("File path:  "+f.getPath()); //directory of the file
		System.out.println("Is it absolute:  "+f.isAbsolute()); //checking the full path is given or not.Ans:- True
		System.out.println("File absolute path "+f.getAbsolutePath()); //full path of the file
		System.out.println("Existence of file:  "+f.exists()); //checking the file existence.Ans:- True
		System.out.println("CAn I read it: "+f.canRead());  
		System.out.println("CAn I write it: "+f.canWrite());
		System.out.println("Is it a file: "+f.isFile()); //Checking whether it is the path of File?
		System.out.println("Is it a directory: "+f.isDirectory()); // Checking whether it is path of Directory?
		System.out.println("When it was last modified:  "+f.lastModified()); //last modified dat and time
		/*It is measured in milliseconds and starts from 1st Jan 1970 */
		System.out.println("Size of file in bytes:  "+f.length()); // Ans- File size in bytes
		/*
		System.out.println(" "+f.delete()); Deleted the file 
		System.out.println("Rename file:  "+f.renameTo(new File("C:/Users/xixeon/Desktop/def.txt")));
		*/
	}
}