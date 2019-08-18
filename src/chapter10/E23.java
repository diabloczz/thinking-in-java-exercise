package chapter10;

public class E23 {
	public static void main(String[] args) {
		B b = new B(3);
		for (int i = 0; i < 3; i++) {
			b.add(new A().getU());
		}
		b.callMethods();
		System.out.println("****");
		b.setNull(0);
		b.callMethods();
	}
}

interface U {
	void f();

	void g();

	void h();
}

class A {
	public U getU() {
		return new U() {
			public void f() {
				System.out.println("A.f");
			}

			public void g() {
				System.out.println("A.g");
			}

			public void h() {
				System.out.println("A.h");
			}
		};
	}
}

class B {
	U[] ua;

	public B(int size) {
		ua = new U[size];
	}

	public boolean add(U elem) {
		for (int i = 0; i < ua.length; i++) {
			if (ua[i] == null) {
				ua[i] = elem;
				return true;
			}
		}
		return false; // Couldn't find any space
	}

	public boolean setNull(int i) {
		if (i < 0 || i >= ua.length)
			return false; // Value out of bounds
		// (Normally throw an exception)
		ua[i] = null;
		return true;
	}

	public void callMethods() {
		for (int i = 0; i < ua.length; i++)
			if (ua[i] != null) {
				ua[i].f();
				ua[i].g();
				ua[i].h();
			}
	}

}