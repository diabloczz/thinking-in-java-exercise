package chapter5;

public class E19 {
	public static void print(String... args) {
		for (String s : args) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		print("aaa", "bbb", "ccc");

		print(new String[] { "ccc", "ddd", "eee" });
	}
}
