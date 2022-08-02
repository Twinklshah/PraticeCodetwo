package learning_project;


public class SuperExample {
     String color="white";

      
     
    

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.printcolor();
	}
		
	}
	
class Dog extends SuperExample{
	 String color="green";
	 void printcolor() {
		 System.out.println(color);
		 System.out.println(super.color);
	 }
}
	
	
		
	


