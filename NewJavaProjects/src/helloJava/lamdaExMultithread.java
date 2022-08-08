package helloJava;

public class lamdaExMultithread {
   public static void main(String[] args) {
	   
	   Runnable r=()->{
		   for(int i=0; i<=10;i++) {
			   System.out.println("hello there m feeling sleepy ");
		   }
	   };
	   Thread th=new Thread(r);
	   th.start();
	   for(int i=0;i<=10;i++) {
		   System.out.println("hello there why m feeling sleepy ");
	   }
	
}
	
}
