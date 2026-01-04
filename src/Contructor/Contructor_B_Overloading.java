package Contructor;

public class Contructor_B_Overloading {
	/*
	 * we can create multiple constructors in the same class provided they are
	 * differentiated based on the number of arguments and type of argument. – also
	 * called overloading
	 */
	Contructor_B_Overloading() {
		//constructor
		System.out.println("Call Constructor A");
	}
	Contructor_B_Overloading c2 = new Contructor_B_Overloading(100);
	Contructor_B_Overloading(int x) {
		// parameterize constructor
		System.out.println("X is :"+x);
	}
	
	//Contructor_B_Overloading c1 = new Contructor_B_Overloading(); We can not call same contructor outside main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		Contructor_B_Overloading c1 = new Contructor_B_Overloading();
		//Contructor_B_Overloading c2 = new Contructor_B_Overloading(100);
	}
}
