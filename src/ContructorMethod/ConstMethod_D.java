package ContructorMethod;

public class ConstMethod_D {
	
	public ConstMethod_D() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstMethod_D D = new ConstMethod_D();
		ConstMethod_D.test();
		System.out.println("Main");
	}
	
	public static void test() {
		System.out.println("Static Method");
	}

}
