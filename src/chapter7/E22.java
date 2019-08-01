package chapter7;

public class E22 {
	public static int a = 1;
	static {
		System.out.println("E22 is loaded");
	}

	public static void main(String[] args) {
		// new E22();
		System.out.println(E22.a);
	}
}
