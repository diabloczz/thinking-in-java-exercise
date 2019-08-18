package chapter10;

public class E02 {
	public String a;

	public E02(String a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "E02 [a=" + a + "]" + "\r\n";
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(new E02("object " + i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
