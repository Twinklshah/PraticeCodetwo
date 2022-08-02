package learning_project;

public class FinallyExample {
	
	
	public static void main(String[] args) {
		try {
			//int a=100,c=2;
			//int d=a/2;
			
			int a=100,c=0; //if found exception in try block then catch block will also execute and finally 
			int d=a/0; // this will throw an exception still finally block will exeute.
			
		}catch(Exception e) {
			System.out.println("this is exception");
		}
		finally {
			System.out.println("hello this will execute always");
		}
		}
		
	}


