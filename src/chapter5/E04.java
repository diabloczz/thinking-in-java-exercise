package chapter5;

public class E04 {
	public E04(String s) {
		System.out.println("default construction...");
		System.out.println("String is" + s);
	}

	public static void main(String[] args) {
		E04 e = new E04("aaa");
	}
}
