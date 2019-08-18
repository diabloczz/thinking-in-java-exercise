package chapter10;

public class E26 {
	class E26Inner extends E2601.E2601Inner {

		public E26Inner(E2601 e2601, String a) {
			e2601.super(a);
		}
	}

	public static void main(String[] args) {
		E2601 e2601 = new E2601();
		E26 e26 = new E26();
		E26.E26Inner e26inner = e26.new E26Inner(e2601, "hahaha");
		System.out.println(e26inner);

	}
}
