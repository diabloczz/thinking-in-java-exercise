package chapter7;

public class E24father {
	public static E24super e = new E24super(1);
	public E24super e1;
	static {
		System.out.println("E24father static block is loaded");
	}
	{
		System.out.println("E24father construct block is loaded");
	}

	public E24father() {
		System.out.println("E24father common construct is loaded");
		e1 = new E24super(11);

	}
}

class E24super {
	int a = 1;
	static {
		System.out.println("E24super static block is loaded");
	}

	{
		System.out.println("E24super construct block is loaded");
	}

	public E24super(int a) {
		System.out.println("E24super common construct is loaded ,a is" + a);
		this.a = a;
	}
}
