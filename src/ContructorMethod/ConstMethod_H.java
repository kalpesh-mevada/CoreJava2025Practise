package ContructorMethod;

public class ConstMethod_H {
	
	int ConstMethod_H(){ // Constructor can not have return value
		return 30;
	}
	/*
	 * void ConstMethod_H(){ // Constructor can not have return value return; }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstMethod_H H = new ConstMethod_H(); // method not called
		System.out.println("Main");
		//No output will print because it will consider as method
	}

}
