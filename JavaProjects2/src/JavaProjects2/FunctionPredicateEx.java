package JavaProjects2;

import java.beans.Statement;
import java.util.function.Function;

public class FunctionPredicateEx {
	public static void main(String[] args) {
		Function<Statement,String> f= s->{
			int marks=s.marks;
			String grade=" ";
			if(marks>=80) grade="A[Excellent]";
			else if(marks>=60) grade="B[better]";
			else if(marks>=50) grade="C[good]";	
			else if(marks>=35) grade="D[poor]";
			else grade= "Failed";
		};
		Statement[] s= {
				new Statement("Shreya",100);
				new Statement("Shalini",65);
				new Statement("Shiva",55);
				new Student("Satyam",45); 
				new Statement("Shifali",25);
				
				
		};
		for(Statement s1 :s)
		{
			System.out.println("student name"+s1.name);
			System.out.println("student name"+s1.marks);
			System.out.println("student name"+f.apply(s1));
		}
	}

}
