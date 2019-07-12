package chapter2;

public class Exercise8 {
	public static void main(String[] args) {
		StaticDemo demo1 = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();
		System.out.println(demo2.i == demo1.i);
		StaticDemo demo3 = new StaticDemo();
		System.out.println(demo3.i == demo2.i);

	}
}
