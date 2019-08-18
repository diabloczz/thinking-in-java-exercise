package chapter10;

public class E03 {
	private String a;

	public E03(String a) {
		this.a = a;
	}

	class Inner {
		public String toString() {
			return a;
		}
	}

	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		E03 e = new E03("niamsile");
		E03.Inner inner = e.getInner();
		System.out.println(inner.toString());
	}
}
