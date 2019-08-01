package chapter7;

public class E18 {
	public final E1801 e1 = new E1801();
	public static final E1801 e2 = new E1801();

	@Override
	public String toString() {
		return "E18 [e1=" + e1 + "e2=" + e2 + "]";
	}

	public static void main(String[] args) {
		System.out.println(new E18());
		System.out.println(new E18());
	}
}

class E1801 {
	public static int count;
	public int id = count++;

	@Override
	public String toString() {
		return "E1801 [id=" + id + "]";
	}
}