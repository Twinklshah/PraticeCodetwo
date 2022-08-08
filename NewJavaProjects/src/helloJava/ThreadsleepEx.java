package helloJava;


public class ThreadsleepEx extends Thread{
	public void run(){    
		  for(int i=1;i<10;i++){   
		  // the thread will sleep for the 500 milli seconds   
		    try {
		    Thread.sleep(1000);
		    }
		    catch(InterruptedException e){System.out.println(e);}    
		    System.out.println(i);    
		  }    
		 }    
	
	public static void main(String[] args) {
		
		ThreadsleepEx t1=new ThreadsleepEx();    
		ThreadsleepEx t2=new ThreadsleepEx();    
		     
		  t1.start();    
		  t2.start();    
	}
		
	}


