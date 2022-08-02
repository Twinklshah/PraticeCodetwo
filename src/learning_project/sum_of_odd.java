package learning_project;

import java.util.Scanner;

public class sum_of_odd {
	public static void printSum(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(i%2!=0) {
				
				sum=sum+i;
			}
	    }
		System.out.println(" "+sum);
	}
		public static void main(String[] args) {
			
			
			
			Scanner Sc = new Scanner(System.in);
				int n=Sc.nextInt();
				printSum(n);
			Sc.close();
			
	}
		
	
}


