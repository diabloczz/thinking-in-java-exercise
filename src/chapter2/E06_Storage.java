package chapter2;

public class E06_Storage {
	private String string = "czz learn java";

	int storage(String s) {
		return s.length() * 2;
	}

	public static void main(String[] args) {
		E06_Storage e06_Storage = new E06_Storage();
		System.out.println("string's length in Unicode:" + e06_Storage.storage(e06_Storage.string));
	}
}
