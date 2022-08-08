package helloJava;

interface I1{
	public void m1();
	
}
/* class Demo implements I1{
	public void m1() {
		System.out.println("hello there learning java is fun!!");
	}
}*/

public class lamdaEg  {
	public static void main(String[] args) {
		
	//	I1 interf=new Demo();
	//	 interf.m1();
		
		I1 interf=()->System.out.println("Hello this is by using lamda expression");
		interf.m1(); // here the () this parenthesis denotes to method m1 
		             // and then we can call the method as many times as we wish to
		//interf.m1();
		//interf.m1();
	}
	 
	//note: functional interface require to give reference to the lamda expression.  

}
