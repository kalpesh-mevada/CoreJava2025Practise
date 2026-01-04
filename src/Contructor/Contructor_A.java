package Contructor;

public class Contructor_A {

	/*
	 * we can create multiple constructors in the same class provided they are
	 * differentiated based on the number of arguments and type of argument. – also
	 * called overloading
	 */
	Contructor_A() {
		//constructor
		System.out.println("Call Constructor A");
	}
	Contructor_A(int x) {
		// parameterize contructor
		System.out.println("X is :"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		Contructor_A C1 = new Contructor_A();
		Contructor_A C2 = new Contructor_A(200);
	}
	
	

}
