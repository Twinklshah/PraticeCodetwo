package learningjava3;

interface Car{  // when an interface has only 1 astract method we can say it is Functional interface
	 void pickCar(); // y default public astract vooid pickCar
}

/*class ola implements Car{
	public void pickCar() {
		System.out.println(" hurrah !! arriving soon pick your Car at right time");
	}
}*/
public class lamdaEx {
	public static void main(String[] args) {
		//Car C1=new ola();
		//C1.pickCar();
		
		// implementation of anonymous class
	/*	  Car C=new Car() {
			
			@Override
			public void pickCar() {
				System.out.println("hurrah !! arriving soon pick your Car at right time");
				
			}
			
		  };
		  C.pickCar();  */
		
		Car C=()->{   //lamda Expression
			System.out.println("hurrah !! arriving soon pick your Car at right time");
		};
		C.pickCar();
	}

}
