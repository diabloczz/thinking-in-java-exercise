package chapter2;

public class InitializeDemo {
	public static InitializeDemo2 a = new InitializeDemo2("static first");
	public InitializeDemo2 b = new InitializeDemo2("common second");
	static {
		System.out.println("static block start");
	}
	{
		System.out.println("gouzao block start");
	}

	public static void staticMethod() {
		System.out.println("staticMethod start");

	}

	public InitializeDemo() {
		System.out.println("gouzao method start");
	}

}
