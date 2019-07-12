package test;

public class Test1 {
	public static void main(String[] args) {

		A a = new B();
		System.out.println(a.a);
		B b = new B();
		System.out.println(b.a);
	}

	public static class A {
		int a = 1;
	}

	public static class B extends A {
		int a = 2;
	}
}
