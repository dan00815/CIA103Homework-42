package hw5;

public class Homework5 {
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
	void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	void randAvg() {
		int total = 0;
		for (int i = 0; i < 10; i++) {
			int randomNum = (int) (Math.random() * 101);
			System.out.print(randomNum + " ");
			total += randomNum;
		}
		System.out.println();

		System.out.println(total / 10);
	}

//	maxElement的over loading
	int maxElement(int x[][]) {
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max)
					max = x[i][j];
			}
		}
		return max;
	}

	double maxElement(double x[][]) {
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max)
					max = x[i][j];
			}
		}
		return max;
	}

//	亂數驗證碼
	String genAuthCode() {
//		方法一
//		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//		String randWord = "";
//
//		for (int i = 0; i < 8; i++) {
//			int randNum = (int) (Math.random() * str.length() - 1);
//			randWord += str.charAt(randNum);
//		}

//		方法二
		String randWord = "", str = "";
		for (int i = 65; i <= 90; i++) { // 取A-Z
			str += (char) i;
		}
		for (int i = 97; i <= 122; i++) { // 取a-z
			str += (char) i;
		}
		for (int i = 0; i <= 9; i++) {
			str += i;
		}
		for (int i = 0; i < 8; i++) {
			int randNum = (int) (Math.random() * str.length() - 1);
			randWord += str.charAt(randNum);
		}

		return randWord;
	}
}
