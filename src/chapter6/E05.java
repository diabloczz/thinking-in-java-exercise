package chapter6;

public class E05 {
	public int a;
	private int b;
	protected int c;
	int d; // Package access

	public void f1() {
	}

	private void f2() {
	}

	protected void f3() {
	}

	void f4() {
	}

	public static void main(String[] args) {
		E05 test = new E05();
		test.a = 1;
		test.b = 2;
		test.c = 3;
		test.d = 4;
		test.f1();
		test.f2();
		test.f3();
		test.f4();
	}

}
