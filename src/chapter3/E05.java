package chapter3;

public class E05 {
	public static void main(String[] args) {
		Dog dog = new Dog("spot", "Ruffs!");
		Dog dog1 = new Dog("scruffy", "wuff");
		System.out.println(dog.toString());
		System.out.println(dog1.toString());

		Dog dog2 = dog;
		System.out.println(dog == dog1);
		System.out.println(dog == dog2);
		System.out.println(dog1 == dog2);
		System.out.println(dog.equals(dog1));
		System.out.println(dog.equals(dog2));
		System.out.println(dog1.equals(dog2));
	}
}

class Dog {
	String name = "spot";
	String says = "Ruffs!";

	public Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", says=" + says + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((says == null) ? 0 : says.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (says == null) {
			if (other.says != null)
				return false;
		} else if (!says.equals(other.says))
			return false;
		return true;
	}

}
