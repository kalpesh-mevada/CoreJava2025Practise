package ContructorMethod;

public class ConstMethod_E {
	int i = 20;
	public ConstMethod_E() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ConstMethod_E()); // it will show memory address
		System.out.println(new ConstMethod_E().i);
	}

}
