package chapter3;

public class E02 {
	public float i;

	public E02(float i) {
		this.i = i;
	}

	public void set(float i) {
		this.i = i;
	}

	public static void main(String[] args) {
		E02 a = new E02(12.10f);
		E02 b = new E02(12.11f);
		a = b;
		a.set(12.13f);
		System.out.println(a.i + "," + b.i);

	}
}
