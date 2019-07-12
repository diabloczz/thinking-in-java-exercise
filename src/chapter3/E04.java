package chapter3;

public class E04 {
	public static int d = 1000;
	public static int v = 10;

	public static int counter() {
		if (v != 0) {
			return d / v;
		} else {
			System.out.println("除数不能为0");
			return 0;
		}

	}

	public static void main(String[] args) {
		System.out.println(counter());
	}
}
