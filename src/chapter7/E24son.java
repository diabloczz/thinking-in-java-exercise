package chapter7;

public class E24son extends E24father {
	public static E24super e = new E24super(2);
	public E24super e1;

	static {
		System.out.println("E24son static block is loaded");
	}
	{
		System.out.println("E24son construct block is loaded");
	}

	public E24son() {
		super();
		System.out.println("E24son common construct is loaded");
		e1 = new E24super(22);

	}
}
