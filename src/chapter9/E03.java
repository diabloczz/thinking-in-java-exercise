package chapter9;

public class E03 {
	public static void main(String[] args) {
		E0301 e = new E0302();
		e.print();
	}
}

abstract class E0301 {

	abstract void print();

	public E0301() {
		print();
	}
}

class E0302 extends E0301 {
	public String a = "aaaa";

	@Override
	void print() {
		System.out.println("this .a =" + a);
	}

}
