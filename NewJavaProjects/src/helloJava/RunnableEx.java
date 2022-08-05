package helloJava;

public class RunnableEx implements Runnable{
	public void run() {
		System.out.println("thread task is runnig");
	}

	public static void main(String[] args) {
//We create a new class which implements java.lang.Runnable interface and override run() method. 

//Then we instantiate a Thread object and call start() method on this object. 		
		RunnableEx RS=new RunnableEx();
		Thread th=new Thread(RS);
		th.start();
		
//If we extend the Thread class, our class cannot extend any other class because 
//Java doesn’t support multiple inheritance. But, 
//if we implement the Runnable interface, 
//our class can still extend other base classes.	
		
	}

}
