package chapter8;

public class Test1 {
	public static void main(String[] args) {
		Father a1 = new Father();
		a1.set();
		System.out.println(a1.a);
		Son a2 = new Son();
		a2.set();
		System.out.println(a2.a);
		Father a = new Son();
		a.set();
		System.out.println(a.a);

	}
}

class Father {
	int a = 1;

	public int print() {
		return this.a;
	}

	public void set() {
		this.a = 100;
	}

	@Override
	public String toString() {
		return "Father [a=" + a + "]";
	}

}

class Son extends Father {
	int a = 2;
//	@Override
//	public void set() {
//		this.a = 200;
//	}

	@Override
	public int print() {
		return this.a;
	}

	@Override
	public String toString() {
		return "Son [a=" + a + "]";
	}

}
