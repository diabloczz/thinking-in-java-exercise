package chapter5;

public class E14 {
	public static String a = "aaa";
	public static String b;
	static {
		b = "bbb";
	}

	public static void print() {
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {
		print();
	}

}
