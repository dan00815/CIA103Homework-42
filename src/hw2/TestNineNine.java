package hw2;

public class TestNineNine {
	public static void main(String[] args) {
//		九九乘法表
//		- for + while

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + " x " + j + " = " + i * j + "\t");
				j++;
			}
			System.out.println();
		}

		System.out.println("================================================");

//		- for + do...while

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + " x " + j + " = " + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
		}

		System.out.println("================================================");

//		- while + do...while
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + " x " + j + " = " + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}
}
