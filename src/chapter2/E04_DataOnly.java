package chapter2;

public class E04_DataOnly {
	int i;
	double d;
	boolean b;

	public E04_DataOnly() {
		super();
	}

	public E04_DataOnly(int i, double d, boolean b) {
		super();
		this.i = i;
		this.d = d;
		this.b = b;
	}

	@Override
	public String toString() {
		return "E04_DataOnly [i=" + i + ", d=" + d + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		E04_DataOnly e04_DataOnly1 = new E04_DataOnly();
		System.out.println(e04_DataOnly1.toString());
		E04_DataOnly e04_DataOnly2 = new E04_DataOnly(12, 23.09, true);
		System.out.println(e04_DataOnly2.toString());
	}
}
