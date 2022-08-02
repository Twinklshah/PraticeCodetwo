package learningjava2;

import java.util.HashSet;
import java.util.Set;

public class customHashsetEx {
	
	public static void main(String[] args) { 
		Set<Student> studentSet=new HashSet<>();
		studentSet.add(new Student ("anuj",1));
		studentSet.add(new Student ("ankita",3));
		studentSet.add(new Student ("aman",4));
		studentSet.add(new Student ("anurag",5));
		studentSet.add(new Student ("ankit",1));  //this is repeating rollno is 1 but hashset is not able to understand
		//it so we will modify the student class it uses equals method to check wheter the element present or not
		
		System.out.println(studentSet);
		
	}

}
