package chapter7;

public class E01 {
	public Test1 test1;

	public Test1 getInstance() {
		test1 = new Test1();
		return test1;
	}

	public Test1 visit() {
		if (test1 == null) {
			return getInstance();
		}
		return test1;
	}

	public static void main(String[] args) {
		E01 e = new E01();
		// System.out.println(e.test1);
		System.out.println(e.visit());
	}
}
