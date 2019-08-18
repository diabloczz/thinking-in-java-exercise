package chapter9;

public class E04 {
	public static void test1(E0401 e) {
		((E0402) e).print();
	}

	public static void test2(E0403 e) {
		e.print();
	}

	public static void main(String[] args) {
		new E0402().aaa();
		test1(new E0402());
		test2(new E0404());
	}
}

abstract class E0401 {
	private String ppp() {
		System.out.println("this is ppp");
		return "this is ppp 's result ";
	}

	public void aaa() {
		System.out.println(ppp());
	}
}

class E0402 extends E0401 {
	void print() {
		System.out.println("aaaaa");
	}

}

abstract class E0403 {
	abstract void print();
}

class E0404 extends E0403 {
	void print() {
		System.out.println("bbbbbb");
	}

}