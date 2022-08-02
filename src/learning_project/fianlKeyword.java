package learning_project;

public class fianlKeyword {
	final int a=7;
	//a=10; since it is used with final so we can't modify the value of a
	
	
	public static void main(String[] args) {
		T oj1=new T();
	oj1.show();
	}

}
final class A{
	final public void show(){
      System.out.println("this is Show class");		
	}
}
 //class D extends A{  //since we have specified the Class A as final so we can't extends the class A 
	
   //public void show(){    // it showing error that we can't override the final method of class A
      //System.out.println("this is Show class");		
		//}


 class C {
	public void show() { 
		 System.out.println("hello practising the final keyword concept");
	 }
 }
 class T extends C{
	 
 }
