package chapter10;

public class E18 {
	static class Nested {
		void f() {
			System.out.println("Nested.f");
		}
	}

	public static void main(String args[]) {
		Nested ne = new Nested();
		ne.f();
	}
}

class Other {
	// Specifying the nested type outside
	// the scope of the class:
	void f() {
		E18.Nested ne = new E18.Nested();
	}
}
