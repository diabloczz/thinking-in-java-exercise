package chapter9;

import java.util.Random;

public class CharGenerator {
	private static Random rand = new Random(47);
	private int length;
	public static final char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

	public CharGenerator(int length) {
		super();
		this.length = length;
	}

	public String generate() {
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < length; i++) {
			sb.append(charArray[rand.nextInt(charArray.length)]);
		}
		sb.append("\r\n");
		return sb.toString();
	}

}
