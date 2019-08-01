package chapter7;

public class E13 extends E13Father {
	public void print(E13 a) {
		System.out.println("this is E13 " + a);
	}

	public static void main(String[] args) {
		E13 e = new E13();
		e.print(1);
		e.print(2.0);
		e.print("aaa");
		e.print(e);
	}
}

class E13Father {
	public void print(int a) {
		System.out.println("this is int " + a);
	}

	public void print(double a) {
		System.out.println("this is double " + a);
	}

	public void print(String a) {
		System.out.println("this is String " + a);
	}
}
