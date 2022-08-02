package learningjava2;

import java.util.Objects;

public class Student implements Comparable <Student>{
	
	String Name;
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", rollNo=" + rollNo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}
	int rollNo;
	public Student (String Name, int rollNo)
	{
		this.Name=Name;
		this.rollNo=rollNo;
		
	}
	public static void main(String[] args) {
		
	}
	@Override
	public int compareTo(Student that) {
		return this.rollNo-that.rollNo;
		
		// TODO Auto-generated method stub
		//return 0;
	}
	
   
}
