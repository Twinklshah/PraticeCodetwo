
public class type_castingex {
	
	
	public static void main(String[] args) {
		
		//widening type casting
		 int myinteger=10;
		 double mydouble = myinteger;
		 System.out.println(myinteger);
		 System.out.println(mydouble);
		
		 // narrowing type casting
		 double myDouble = 9.79d;
		    int myInt = (int) myDouble; // Manual casting: double to int

		    System.out.println(myDouble);   // Outputs 9.78
		    System.out.println(myInt);
	}

}
