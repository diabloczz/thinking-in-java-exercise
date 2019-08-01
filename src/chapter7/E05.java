package chapter7;

public class E05 {
	public static void main(String[] args) {
		new C();
	}
}

class A {
	public A() {
		System.out.println("this is a");
	}
}

class B {
	public B() {
		System.out.println("this is b");
	}
}

class C extends A {
	public B b = new B();

}
