package hw7;

public class Dog extends Animal {
	private static final long serialVersionUID = 1L;
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
