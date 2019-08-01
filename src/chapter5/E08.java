package chapter5;

public class E08 {
	public void a() {
		System.out.println("aaa");

	}

	public void b() {
		a();
		this.a();
	}

	public static void main(String[] args) {
		E08 e = new E08();
		e.b();
	}
}
