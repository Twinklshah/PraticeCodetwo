package learningjava2;

import java.util.Arrays;

public class ArrayClass {
       public static void main(String[] args) {
		//int numers[]= {1,2,3,4,5,6,7,8,9,10};
		//int index= Arrays.binarySearch(numers, 2);
		
		//System.out.println("The index of element 2 in the array is: " +index );
		
		
	 /* int numer[]= {12,13,45,67,34,23,60,87,78,56};
	   Arrays.sort(numer);*/
	   
    	   Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
           Arrays.sort(numbers);
         

          // Arrays.parallelSort(numbers);
           // 8192 this will work when numer is greater than 8192 

           //Arrays.fill(numbers, 12);

           for (int i : numbers) {
               System.out.print(i + " ");
           }
	   
	  
	}
}

