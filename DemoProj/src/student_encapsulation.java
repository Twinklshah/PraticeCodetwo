 class student {
	int roll_no;
     String Name;
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}


	

public class student_encapsulation {	
	
 public static void main(String[] args) {
	 
	 student s1= new student();
			 s1.setRoll_no(1200);
			 s1.setName("Neha"); 
			 
 System.out.println(s1.getRoll_no());
 System.out.println(s1.getName());
 
	 
	
}
}
