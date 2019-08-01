package chapter5;

public class E05 {
	public void bowl(int a) {
		System.out.println("dog is bowling");
	}

	public void bowl(char a) {
		System.out.println("dog is howling");
	}

	public void bowl(double a) {
		System.out.println("dog is feeting");
	}

	public static void main(String[] args) {
		E05 e = new E05();
		e.bowl('s');
		e.bowl(20.1);
		e.bowl(4);
	}
}
