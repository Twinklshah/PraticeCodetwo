package learning_project;
class Animal{
	void wildAnimal() {
		System.out.println("they are wild animal");
	}
}

class Birds extends Animal{
	void seaBirds() {
		System.out.println("they are the seabird");
	}
}
public class InheritanceExample extends Animal  {
	InheritanceExample(){ System.out.println("this is example of inheritance");
	}
	public static void main(String[] args) {
		InheritanceExample IE=new InheritanceExample();
		Birds B =new Birds();
		B.seaBirds();
		B.wildAnimal();
		//IE.wildAnimal(); 
		
	
		
		
	}

}
