package learning_project;


interface I1{
	void add();
}
interface I2{
	void mult();
	}

 
public class InterfaceExample implements I1,I2{
	
	public void add() {
		System.out.println("this is example of interface");
	}
	public void mult() {
		System.out.println("hello there");
	}
	public static void main(String[] args) {
		InterfaceExample IE =new InterfaceExample();
		IE.add();
		IE.mult();
		
	}

}
