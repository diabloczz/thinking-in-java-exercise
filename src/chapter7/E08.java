package chapter7;

public class E08 {
	public static void main(String[] args) {
		new Son();
		new Son("drinking");
	}
}

class Father {
	public Father(String s) {
		System.out.println("father is " + s);
	}
}

class Son extends Father {

	public Son() {
		super("funcking");
	}

	public Son(String s) {
		super("sleeping");
		System.out.println("son is sleeping");
	}
}
