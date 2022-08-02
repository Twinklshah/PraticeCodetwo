package learning_project;
class School{
	int rollno;
	String name;

	School(int rollno, String name){
		this.name=name;
		this.rollno=rollno;
	}   
	
}
public class AggrigationEx {
	int marks;
	String department;
	School sc;
	
	AggrigationEx(int marks, String department,School sc)
	{
		this.marks=marks;
		this.department=department;
		this.sc=sc;
		
	}

	
    public static void main(String[] args) {
    	School sc=new School(29,"Vikram");
    	AggrigationEx Ag=new AggrigationEx(99,"Bsc",sc);
    	System.out.println("student details is"+Ag.marks+"department is"+Ag.department+"School name is"+Ag.sc);
    	// School Details are
    	System.out.println("School details are"+Ag.sc.name+"and roll no is"+Ag.sc.rollno);
    
    	
		
	}
	
}

