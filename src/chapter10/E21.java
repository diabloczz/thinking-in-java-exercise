package chapter10;

public class E21 {
	public static void main(String[] args) {
		WithNested1 ee = new WithNested1() {
			public int getA() {
				return 99;
			}
		};
		WithNested1.Nested1.f(ee);
	}

}

interface WithNested1 {
	int getA();

	class Nested1 {
		static void f(WithNested1 e) {
			System.out.println(e.getA());
		}
	}
}