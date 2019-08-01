package chapter7;

public class E19 {
	public final int a;
	public final Reference r;

	public E19() {
		this.a = 1;
		r = new Reference(1);
	}

	public E19(int x) {
		this.a = x;
		r = new Reference(x);
	}

	@Override
	public String toString() {
		return "E19 [a=" + a + ", r=" + r + "]";
	}

	public static void main(String[] args) {
		System.out.println(new E19());
		System.out.println(new E19(5));
	}
}

class Reference {
	int b;

	public Reference(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Reference [b=" + b + "]";
	}

}
