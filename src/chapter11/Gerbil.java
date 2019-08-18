package chapter11;

public class Gerbil {
	public int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public void hop() {
		System.out.println("the Gerbil:" + gerbilNumber + " is jumping");
	}

	public static void main(String[] args) {
		String a = "175/1";
		int index = a.indexOf("/");
		String size = a.substring(0, index);
		System.out.println(size);
		System.out.println(a.substring(index + 1));
	}

	@Override
	public String toString() {
		return "Gerbil [gerbilNumber=" + gerbilNumber + "]";
	}
	
}
