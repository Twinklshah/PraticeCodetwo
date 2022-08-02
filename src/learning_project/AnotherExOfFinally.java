package learning_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AnotherExOfFinally {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =null;
		try
		{

			fis = new FileInputStream("d:/acd.txt");

		}catch(
		FileNotFoundException e)
		{
			System.out.println("this is FileNotFound exception example ");
		}finally
		{           //finally keyword is also use for cleanup and close the program.and for  close connection
			if (fis != null) {  
				fis.close();
				System.out.println("file has closed successfully");
			
			}}
	}
	}