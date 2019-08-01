package chapter5;

public class E02 {
	String a = "diablo";
	String b;

	public E02(String a) {
		System.out.println("constructor initialize。。。");
		this.b = a;
	}

	public static void main(String[] args) {
		E02 e = new E02("czz");
		System.out.println(e.a);
		System.out.println(e.b);
	}

}
