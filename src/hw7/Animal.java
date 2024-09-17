package hw7;

import java.io.Serializable;

public abstract class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	abstract void speak();

}
