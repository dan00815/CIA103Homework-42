package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle myRect = new MyRectangle();
		myRect.setWidth(10);
		myRect.setDepth(20);
		System.out.println(myRect.getArea());

		MyRectangle myRect2 = new MyRectangle(10, 20);
		System.out.println(myRect2.getArea());
	}
}
