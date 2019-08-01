package chapter5;

public class E18 {
	public E18(String s) {
		System.out.println("args :" + s);
	}

	public static void main(String[] args) {
		E18[] e = new E18[] { new E18("aaa") };
	}
}
