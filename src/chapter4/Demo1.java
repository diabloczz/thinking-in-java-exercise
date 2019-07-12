package chapter4;

/**
 * test demo for knowledge point while
 * 
 * @author Administrator
 *
 */
public class Demo1 {
	public static boolean randomMath() {
		boolean result = Math.random() < 0.99;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		while (randomMath()) {
			System.out.println("inside while");
		}
		System.out.println("outside while");
	}
}
