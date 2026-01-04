package ContructorMethod;

public class ConstMethod_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		ConstMethod_B cstmth = new ConstMethod_B();
	}
	
	public ConstMethod_B() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
		return; // return keyword will call control back to place where it called.
	}

}
