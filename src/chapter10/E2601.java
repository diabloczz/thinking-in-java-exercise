package chapter10;

public class E2601 {
	class E2601Inner {
		private String a;

		public E2601Inner(String a) {
			this.a = a;
			System.out.println("E2601's constructor ");
		}

		public String toString() {
			return "E2601's a is" + a;
		}
	}
}
