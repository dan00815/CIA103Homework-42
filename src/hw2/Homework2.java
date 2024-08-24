package hw2;

public class Homework2 {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1~1000的偶數和= " + sum);

//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int oneToTenMultiply = 1;
		for (int i = 1; i <= 10; i++)
			oneToTenMultiply *= i;
		System.out.println("for迴圈, 1~10連乘積 " + oneToTenMultiply);

//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int initial = 1;
		int oneToTenMultiply2 = 1;
		while (initial <= 10) {
			oneToTenMultiply2 *= initial;
			initial++;
		}
		System.out.println("while迴圈, 1~10連乘積 " + oneToTenMultiply2);

//		請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		for (int i = 1; i <= 10; i++) {
			System.out.print((int) (Math.pow(i, 2)) + " ");
		}

		System.out.println();

//		阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//		for跑1~49，有4的刪掉，其他的保留，還要有一個變數裝保留幾個，留下後+1，第二個變數裝保留下來的數字
//		除10餘數等於4表示個位數字是4， 除以10等於4的代表十位數字是4

		int lotteryAmount = 0;
		String lotteryNum = "";
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i / 10 != 4) {
				lotteryAmount++;
				lotteryNum += (i + " ");
			}
		}
		System.out.println("可以選" + lotteryAmount + "個號碼");
		System.out.println("分別是 " + lotteryNum);

		System.out.println();

//		請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1

		for (int i = 10; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

//
//		請設計一隻Java程式,輸出結果為以下:
//		A   //char 65
//		BB  //char 66
//		CCC //char 67
//		DDDD
//		EEEEE
//		FFFFFF

		System.out.println();

		int initialAlphaCode = 64;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (initialAlphaCode + i));
			}
			System.out.println();
		}

	}
}