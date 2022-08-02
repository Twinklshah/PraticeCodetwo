package first_java_project;

abstract class office{
	office()
	{
		System.out.println("office is created");
	}
	abstract void InhouseProject(); 
	
	void ClientSide() {
		System.out.println("client side project can done by home");
	}
}

class Project extends office{
	void InhouseProject() {
		System.out.println("this is inhouse project");
	}
}
public class AlltypeAbstr {
	public static void main(String[] args) {
		office CTO =new Project();
		CTO.InhouseProject();
		CTO.ClientSide();
		
	}

}
