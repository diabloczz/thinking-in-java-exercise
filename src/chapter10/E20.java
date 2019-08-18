package chapter10;

public class E20 {
	public static void main(String[] args) {
		B2 b = new B2();
		WithNested.Nested ne = new WithNested.Nested(5);
		ne.f();
	}

}

interface WithNested {
	class Nested {
		int i;

		public Nested(int i) {
			this.i = i;
		}

		void f() {
			System.out.println("Nested.f");
		}
	}
}

class B2 implements WithNested {
}
