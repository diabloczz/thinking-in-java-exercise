package chapter8;

public class E10 {
	public static void main(String[] args) {
		E1001 e = new E1002();
		e.print();
	}
}

class E1001 {
	public void print() {
		System.out.println(this.get());
	}

	public String get() {
		return "this is E1001";
	}
}

class E1002 extends E1001 {

	public String get() {
		return "this is E1002";
	}
}
