package chapter6;

public class E08 {
	public static void main(String args[]) {
		Connection c = ConnectManager.getConnection();
		while (c != null) {
			System.out.println(c);
			c.doSomething();
			c = ConnectManager.getConnection();
		}
	}
}
