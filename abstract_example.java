package first_java_project;

public class abstract_example {
	public static void main(String[] args) {
		
		Car C=new Car();
		C.start();
		
		Scooter S=new Scooter();
		S.start();
		
	}
}
 
abstract class Vehicle
{
	abstract void start();
}

class Car extends Vehicle{
	void start() {
		System.out.println("hello this is ls car class");
	}
	
}
 
class Scooter extends Vehicle{
	void start() {
		System.out.println("this is scooter class");
	}
}



  