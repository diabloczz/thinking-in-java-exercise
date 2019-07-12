package chapter2;

public class StaticDemo {
	public static int i = 1;

	public StaticDemo() {
		i++;
		System.out.println("StaticDemo.i's value:" + i);
	}

}
