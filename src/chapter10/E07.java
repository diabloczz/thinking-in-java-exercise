package chapter10;

public class E07 {
	private String a = "aaaa";

	private void a() {
		System.out.println("aaaa");
	}

	private class Inner {
		public void set() {
			a = "bbbb";
			a();
		}
	}

	public void createInner() {
		Inner inner = new Inner();
		inner.set();
	}

	public static void main(String[] args) {
		E07 e = new E07();
		System.out.println(e.a);
		e.createInner();
		System.out.println(e.a);
	}
}