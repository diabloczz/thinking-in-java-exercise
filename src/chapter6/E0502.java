package chapter6;

public class E0502 {
	public static void main(String[] args) {
		E05 test = new E05();
		test.a = 1;
		// test.b = 2;// The field E05.b is not visible
		test.c = 3;
		test.d = 4;
		test.f1();
		// test.f2();// The method f2() from the type E05 is not visible
		test.f3();
		test.f4();
	}
}
