package hw7;

import java.io.File;

public class Homework7_test {
	public static void main(String[] args) {
		Homework7 hw = new Homework7();
		hw.hw7Item1();
		hw.hw7Item2();
		File f1 = new File("src/hw7/copy1.txt");
		File f2 = new File("src/hw7/copy2.txt");
		hw.copyFile(f1, f2);

		hw.hw7Item4();
		hw.hw7Item5();

	}
}
