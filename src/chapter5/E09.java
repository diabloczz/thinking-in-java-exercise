package chapter5;

public class E09 {
	int a = 0;

	public E09(int a) {
		this.a = a;
	}

	public E09() {
		this(5);
	}

	@Override
	public String toString() {
		return "E09 [a=" + a + "]";
	}

	public static void main(String[] args) {
		E09 e = new E09();
		System.out.println(e);
	}
}
