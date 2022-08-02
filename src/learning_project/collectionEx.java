package learning_project;

import java.util.ArrayList;

public class collectionEx {
	public static void main(String[] args) {
		
	/*String student[]=new String [30]; 
	
	 student [0]="kangana";
	 // student[1]......student[29]
	 
	student[29]="raman";
	// any new student enter then we can't modify this array coz already array size is declared as 30
	// it shows the error msg Arrayoutofoundsexception.
	// to overcome from this we implement the concept of arraylist. 

	//new student
	student[30]="sheetal";*/
		
	ArrayList<String> studentName=new ArrayList<>();
	// it will create a size of 10 at start, if we add 11th element internally it will add n+n/2 +1
	studentName.add("shiva"); 
	studentName.add("twinkle");
	studentName.add("priya");
	System.out.println(studentName);
	
	
	}
}
