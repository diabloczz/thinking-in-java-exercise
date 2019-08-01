package chapter8;

public class E12 {
	public static void main(String[] args) {
		new Hamster1();
	}

}

class Member {
	String id;

	public Member(String id) {
		this.id = id;
		System.out.println("member initialized..." + id);
	}
}

class Rodent1 {
	public Member m1 = new Member("r1"), m2 = new Member("r2");

	public Rodent1() {
		System.out.println("Rodent1 initialized ");
	}
}

class Hamster1 extends Rodent1 {
	public Member m1 = new Member("h1"), m2 = new Member("h2");

	public Hamster1() {
		System.out.println("Hamster1 initialized ");
	}
}
