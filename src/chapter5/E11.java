package chapter5;

public class E11 {
	protected void finalize() {
		System.out.println("finalize() called");
	}

	public static void main(String[] args) {
		new E11();
		System.gc();
		// System.runFinalization();
	}
}
