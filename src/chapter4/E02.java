package chapter4;

import java.util.Random;

public class E02 {
	public static int[] randomInteger = new int[25];

	public static void generateRandom(int[] randomInteger) {
		for (int i = 0; i < randomInteger.length; i++) {
			Random r = new Random();
			randomInteger[i] = r.nextInt(100);
			System.out.println("randomInteger.i=" + randomInteger[i]);
		}
	}

	public static void printAll(int[] randomInteger) {

		for (int i = 0; i < randomInteger.length; i++) {
			if (i == randomInteger.length - 1)
				return;
			if (randomInteger[i] < randomInteger[i + 1]) {
				System.out.println(randomInteger[i] + "<" + randomInteger[i + 1]);
			} else if (randomInteger[i] > randomInteger[i + 1]) {
				System.out.println(randomInteger[i] + ">" + randomInteger[i + 1]);
			} else {
				System.out.println(randomInteger[i] + "=" + randomInteger[i + 1]);
			}
		}
	}

	public static void main(String[] args) {
		generateRandom(randomInteger);
		printAll(randomInteger);
	}

}
