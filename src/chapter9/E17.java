package chapter9;

public class E17 implements InterfaceConstant {

	public E17() {
//		count++;//The final field InterfaceConstant.count cannot be assigned
	}
  public static void main(String[] args) {
	System.out.println(InterfaceConstant.count);
}
}
