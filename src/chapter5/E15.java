package chapter5;

public class E15 {
	public String a;
	{
		System.out.println("实例初始化");
		a = "aaa";
	}

	public E15() {
		System.out.println("construction ...");
	}

	public static void main(String[] args) {
		E15 e = new E15();
		System.out.println(e.a);
	}

}
