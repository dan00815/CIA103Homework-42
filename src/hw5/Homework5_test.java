package hw5;

import java.util.Scanner;

public class Homework5_test {
	public static void main(String[] args) {
		Homework5 hw5 = new Homework5();

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬高");
		int width = sc.nextInt();
		int height = sc.nextInt();
		hw5.starSquare(width, height);

		hw5.randAvg();

		int[][] arr = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(hw5.maxElement(arr));
		System.out.println(hw5.maxElement(doubleArray));

		System.out.println(hw5.genAuthCode());
	}
}
