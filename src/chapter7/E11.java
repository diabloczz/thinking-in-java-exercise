package chapter7;

public class E11 {
	private Cleanser cleanser = new Cleanser();

	public void scrub() {
		cleanser.scrub();
	}

	public void foam() {
		cleanser.append(" foam()");
	}

	@Override
	public String toString() {
		return "E11 [cleanser=" + cleanser + "]";
	}

	public static void main(String[] args) {
		E11 e = new E11();
		e.scrub();
		e.foam();
		System.out.println(e);
	}
}
