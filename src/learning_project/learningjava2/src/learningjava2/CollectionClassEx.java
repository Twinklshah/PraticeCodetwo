package learningjava2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassEx {
	public static void main(String[] args) {
		
		List<Student> list1=new ArrayList<>();
		list1.add(new Student("suraj", 1));
		list1.add(new Student("chanda", 2));
		list1.add(new Student("jheel", 3));
		list1.add(new Student("tara", 4));
		// how to sort on the basis of rollno
		
		System.out.println(list1);
		
		//Collections.sort(list1);               // it will show an error to remove the error we implemented compareto 
		                                       // in student class so that we can compare the two student on the basis of rollno or name
		Collections.sort(list1,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.Name.compareTo(o2.Name);
			}
			
		});
		System.out.println(list1);
	  
	/*  List<Integer> list = new ArrayList<>();
      list.add(34);
      list.add(12);
      list.add(9);
      list.add(9);
      list.add(9);
      list.add(76);
      list.add(29);
      list.add(75);

      System.out.println("min element " + Collections.min(list));
      System.out.println("max element " + Collections.max(list));
      System.out.println(Collections.frequency(list, 9));

      //Collections.sort(list, Comparator.reverseOrder());

     System.out.println(list);*/
		
	}

}
