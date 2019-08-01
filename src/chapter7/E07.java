package chapter7;

public class E07 {
	public static void main(String[] args) {
		new C1();
	}
}

class A1 {
	public A1() {
		System.out.println("this is a");
	}
}

class B1 {
	public B1() {
		System.out.println("this is b");
	}
}

class C1 extends A1 {
	public C1() {
		b = new B1();
		System.out.println("this is c");

	}

	public B1 b;

}