package chapter5;

public class E06 {
	public void bowl(int a, double b) {
		System.out.println("dog is bowling");
	}

	public void bowl(double b, int a) {
		System.out.println("dog is howling");
	}

	public static void main(String[] args) {
		E06 e = new E06();
		e.bowl(12.0, 2);
		e.bowl(12, 2.56);
	}
}
