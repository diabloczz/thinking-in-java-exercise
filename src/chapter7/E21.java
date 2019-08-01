package chapter7;

public class E21 extends E21father {
//	public void print() {
//		System.out.println("bbb");// Cannot override the final method from E21father
//	}
}

class E21father {
	public final void print() {
		System.out.println("aaa");
	}
}
