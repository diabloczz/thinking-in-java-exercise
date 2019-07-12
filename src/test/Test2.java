package test;

import java.util.Random;

public class Test2 {
	private static char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	public static String generatePackageId() {
		StringBuilder sb = new StringBuilder(12);
		sb.append("XX");
		for (int i = 0; i < 8; i++) {
			Random r = new Random();
			int a = r.nextInt(charArray.length);
			sb.append(charArray[a]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(generatePackageId());
	}
}
