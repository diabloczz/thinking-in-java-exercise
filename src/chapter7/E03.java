package chapter7;

public class E03 extends Father03 {
	public E03() {
		System.out.println("son lululululu");
	}

	public static void main(String[] args) {
		E03 e = new E03();
	}
}

class Father03 {
	public Father03() {
		System.out.println("lululululu");
	}
}
