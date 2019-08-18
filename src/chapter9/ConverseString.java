package chapter9;

public class ConverseString {
	public String converse(String str) {
		char[] chars = ((String) str).toCharArray();
		for (int i = 0; i < chars.length; i += 2) {
			if (i == chars.length - 1)
				break;
			char a = chars[i];
			chars[i] = chars[i + 1];
			chars[i + 1] = a;
		}
		return new String(chars);
	}
}
