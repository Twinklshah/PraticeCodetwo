
public class MainClass {

	
	public void primitive_example() {
	
		int a=10;
		int b=a;
		b++;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void reference_ex() {
		String s= "neha";
		String s2=s;
		System.out.println(s2);
		
	}
	 
  public static void main(String[] args) {
	  
	MainClass m=new MainClass();
	m.primitive_example();
	m.reference_ex();
	  System.out.println("hello welcome to the java world Nilesh");
	  
}
}
