package helloJava;
//class Multithread extends Thread{
	
	
	

public class MultiThreadingEx extends Thread  {  //Thread class overrides the run() method available in the  Thread class. 
	//A thread begins its life inside run() method.
	//We create an object of our new class and call start() method to start the execution of a thread. 
	
	public void run() {
		System.out.println("thread task is about to start");
	}
	
	public static void main(String[] args) {
		
		MultiThreadingEx MT=new MultiThreadingEx();
		MT.start();  //Start() invokes the run() method on the Thread object.
		MultiThreadingEx MT1=new MultiThreadingEx();
		MT1.start(); // we can create as many thread as we can
		
		MT.start(); //this will throw an exception cause thread has already reach to dead state
	                //once it executed after that it will reach to dead state	
	}

}
