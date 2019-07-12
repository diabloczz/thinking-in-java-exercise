package chapter3;

import java.util.Random;

public class E07 {
	public static void main(String[] args) {
//		Random r = new Random(47);
//		for (int i = 0; i < 100; i++) {
//			boolean result = r.nextBoolean();
//			System.out.println(result);
//		}

//		boolean result1 = r.nextBoolean();
//		System.out.println(result1);
//		result1 = r.nextBoolean();
//		System.out.println(result1);
//		result1 = r.nextBoolean();
//		System.out.println(result1);
//		result1 = r.nextBoolean();
//		System.out.println(result1);
		Random rand = new Random(47);
		boolean flip = rand.nextBoolean();
		System.out.print("OUTCOME: ");
		System.out.println(flip ? "HEAD" : "TAIL");
	}
}
