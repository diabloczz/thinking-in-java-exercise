package chapter10;

public class E12 {
	private String a = "aaaa";

	private void a() {
		System.out.println("aaaa");
	}

	// 用匿名内部类的形式，创建类中方法，访问外部方法和成员
	public void g() {
		new E12() {
			public void g() {
				a = "bbbb";
				a();
			}
		}.g();
	}

	public static void main(String[] args) {
		E12 e = new E12();
		e.g();
		System.out.println("E12's value=" + e.a);
	}
}
