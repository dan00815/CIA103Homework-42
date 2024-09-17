package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		boolean res = false;
		boolean check;

		while (!res) {

			try {
				Calculator cal = new Calculator();
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入X");
				check = sc.hasNextInt();
				if (!check) {
					throw new CalException("輸入格式錯誤");
				}
				int x = sc.nextInt();

				System.out.println("請輸入Y");
				check = sc.hasNextInt();
				if (!check) {
					throw new CalException("輸入格式錯誤");
				}
				int y = sc.nextInt();
				

				cal.powerXY(x, y);
				res = true;

			} catch (CalException err) {
				System.out.println(err.getMessage());
			}

		}

	}

}
