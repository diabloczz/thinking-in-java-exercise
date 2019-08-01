package chapter4;

public class E08 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int a = 2;
			switch (a) {
			case 2:
				System.out.println("a=" + a);
				break;

			case 3:
				System.out.println("a=" + 3);
				break;
			case 4:
				System.out.println("a=" + 4);
				break;
			default:
				System.out.println("aaaaa");
			}
		}
	}
}