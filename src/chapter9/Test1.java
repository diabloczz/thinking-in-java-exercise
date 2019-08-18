package chapter9;

public class Test1 extends Test2 implements FastFood1 {

}

interface FastFood1 {
	void eat();
}

class Test2 {
	public void eat() {
		System.out.println("eat");// Duplicate method eat() in type Test2
	}

//	public int eat() {
//		return 1;
//	}
}