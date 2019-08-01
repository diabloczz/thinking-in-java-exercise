package chapter5;

public class E12 {
	public boolean flag;

	public E12(boolean flag) {
		this.flag = flag;
	}

	public E12() {
		super();

	}

	protected void finalize() {
		if (!flag) {
			System.err.println("flag is false,cant finalize");
			return;
		}

		System.out.println("flag is true,is finalizing");
	}

	public static void main(String[] args) {
		new E12();
		System.gc();
		new E12(true);
		System.gc();
	}
}
