package chapter7;

public class Test1 {
	private String b = "aaaa";
	public int a = 1;

	private void print() {
		System.out.println(b);
	}

	@Override
	public String toString() {
		return "Test1 [a=" + a + "]";
	}

	public static void main(String[] args) {
		Test1 e = new Test1();
		e.print();
		e.b = "bbbbb";
		e.print();
	}
}
