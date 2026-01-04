package ContructorMethod;

public class ConstMethod_A {
	
	public ConstMethod_A() {
		// Constructor
		System.out.println("Constructor with return type will "
				+ "show error becaue constructor is always void");
		//return 30; if add return type, then it will give error.
	}
	public static void main(String[] args) {
		ConstMethod_A cstmthd = new ConstMethod_A();
		System.out.println("Main");
	}
}
