package ContructorMethod;

public class ConstMethod_G {
	
	public ConstMethod_G() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	
	public void test() {
		System.out.println("Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstMethod_G().test();
		System.out.println("Main");
	}

}
