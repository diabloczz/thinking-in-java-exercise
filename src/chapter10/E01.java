package chapter10;

public class E01 {
	public Inner getInner() {
		return new Inner();
	}

	class Inner {

	}

	public static void main(String[] args) {
//		E01 e = new E01();
//		E01.Inner inner = e.getInner();
//		System.out.println(inner);
		String a = "12.0";
		if (a.contains(".")) {
			a = a.substring(0, a.indexOf("."));
		}
		System.out.println(a);
	}
}
