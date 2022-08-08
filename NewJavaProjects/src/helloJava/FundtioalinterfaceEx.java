package helloJava;
//functional interface 

public interface FundtioalinterfaceEx {
	
	public void method1(); //abstract method
	default void m2() {  // fuctional interface contain only one abstract method but it can 
		                 //contain any number of default methods and static methods
	}
	
	
   public static void m3() {
   }
	
}
	


// @functional Interface 

 interface I2 extends FundtioalinterfaceEx{ // since functional interface should contain 
	                                        //one abstract method so it is valid to extends
	                                        // the interfaces because it will inherit the 
	                                        //only one abstract method that is method1.
	 
	 public void method1(); // this is also valid coz it is overriding the same method.
	 public void method2();// it will give an error because interface I2 has 2 abstract method now which is not valid.
	 
	 // note if we remove @Functional interface annotations then this can be valid because interface has multiple abstract method. 
 } 