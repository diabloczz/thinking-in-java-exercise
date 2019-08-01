package chapter8;

public class E14 {
	public static void main(String[] args) {
		Member2 e = new Member2();
		Rodent2[] r2s = new Rodent2[] { new Rodent2(e), new Hamster2(e) };
	}
}

class Member2 {
	private long refcount;
	private static long count = 0;
	private long id = count++;

	public void addRef() {
		System.out.println("shared Member2,refcount is " + ++this.refcount);
	}

	@Override
	public String toString() {
		return "Member2 [id=" + id + "]";
	}

}

class Rodent2 {
	public Member2 m2;

	public Rodent2(Member2 m2) {
		this.m2 = m2;
		this.m2.addRef();
		System.out.println("use common Member2:" + this.m2);
	}

}

class Hamster2 extends Rodent2 {
	public Member2 m2;

	public Hamster2(Member2 m2) {
		super(m2);
		this.m2 = m2;
		this.m2.addRef();
		System.out.println("use common Member2:" + this.m2);
	}
}
