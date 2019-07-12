package chapter2;

public class E07_Increment {
	public static void increment() {
		StaticTest.i++;
	}

	public static void main(String[] args) {
		E07_Increment e07_Increment = new E07_Increment();
		e07_Increment.increment();
		E07_Increment.increment();
		System.out.println(StaticTest.i);

	}
}

class StaticTest {
	public static int i = 100;
}