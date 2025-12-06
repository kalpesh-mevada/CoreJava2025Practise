package First_Class_Object;

public class First_ClassObject {
	int i=10; // non-static member gets loaded when everytime object created in RAM / Memory
	static int j=20; // Static member gets loaded with class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_ClassObject a1 = new First_ClassObject(); // how memory address looks like and how represented
	    System.out.println(" Non Static Member access by Object created with new keyword:" +a1.i); // To access non-static member 
	    System.err.println(" Static Member access by Class:" +First_ClassObject.j);
	    System.out.println("Address of Object in Hexadecimal and everytime object created memory address will be differetn"+" : "+a1); // how memory address looks like and how represented

	}

}
