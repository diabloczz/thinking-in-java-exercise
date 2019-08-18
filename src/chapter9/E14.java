package chapter9;

public class E14 extends Concrete implements Multiple {
	public E14(String s) {
		super(s);
	}

	public void f1() {
		System.out.println("E14.f1");
	}

	public void g1() {
		System.out.println("E14.g1");
	}

	public void f2() {
		System.out.println("E14.f2");
	}

	public void g2() {
		System.out.println("E14.g2");
	}

	public void f3() {
		System.out.println("E14.f3");
	}

	public void g3() {
		System.out.println("E14.g3");
	}

	public void h() {
		System.out.println("E14.h");
	}

	public void test1(Interface1 e) {
		e.f1();
		e.g1();
	}

	public void test2(Interface2 e) {
		e.f2();
		e.g2();
	}

	public void test3(Interface3 e) {
		e.f3();
		e.g3();
	}

	public void test4(Multiple e) {
		e.f1();
		e.g1();
		e.f2();
		e.g2();
		e.f3();
		e.g3();
		e.h();
	}

	public static void main(String[] args) {
		E14 ee = new E14("E14");
		ee.test1(ee);
		ee.test2(ee);
		ee.test3(ee);
		ee.test4(ee);
	}
}

interface Interface1 {
	void f1();

	void g1();
}

interface Interface2 {
	void f2();

	void g2();
}

interface Interface3 {
	void f3();

	void g3();
}

interface Multiple extends Interface1, Interface2, Interface3 {
	void h();
}

class Concrete {
	String s;

	public Concrete(String s) {
		this.s = s;
	}
}
