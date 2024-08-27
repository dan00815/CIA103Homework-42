package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		showTriangle();
		guessNumber0To9();
		guessNumber0To100();
		printLotteryNum();
		System.out.println("==============================");
		printSixLotteryNum();
	}

	public static Scanner sc = new Scanner(System.in);

//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形
	public static void showTriangle() {

		System.out.println("Input three numbers");
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int sc3 = sc.nextInt();

		int[] borders = { sc1, sc2, sc3 };
		Arrays.sort(borders);
		int side1 = borders[0];
		int side2 = borders[1];
		int side3 = borders[2];

		if (side1 + side2 > side3) {
			if (side1 == side2 && side2 == side3)
				System.out.println("正三角形");
			else if (side1 == side2 || side2 == side3)
				System.out.println("等腰三角形");
			else if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2))
				System.out.println("直角三角形");
			else
				System.out.println("其他三角形");
		} else {
			System.out.println("不是三角形");
		}
	}

//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息
	public static void guessNumber0To9() {
		int answer = (int) (Math.random() * 10);

		System.out.println("Start To Guess Numbers: 0~9");
		int guessNum = sc.nextInt();
		while (guessNum != answer) {
			System.out.println("答錯了");
			guessNum = sc.nextInt();
		}
		System.out.println("答對了，答案是: " + answer);

	}

//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	public static void guessNumber0To100() {
		int answer = (int) (Math.random() * 101);

		System.out.println("Start To Guess Numbers: 0~100");
		int guessNum = sc.nextInt();

		while (guessNum != answer) {
			if (guessNum < answer) {
				System.out.println("小於正確答案，往上猜");
			} else
				System.out.println("大於正確答案，往下猜");

			guessNum = sc.nextInt(); // 透過這行終止無窮迴圈
		}

		System.out.println("答對了，答案是: " + answer);

	}

//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數
	public static void printLotteryNum() {
		System.out.println("阿文...請輸入討厭哪個數字");
		int dislikeNum = sc.nextInt(), amount = 0;
		String lottery = "";

		while (dislikeNum > 9 || dislikeNum < 1) { // 輸入不符合則讓阿文重新輸入
			System.out.println("請輸入1~9");
			dislikeNum = sc.nextInt();
		}

		// 用dislikeNum 來排除
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != dislikeNum && i / 10 != dislikeNum) {
				amount++;
				lottery += (i + " ");
			}
		}
		System.out.println("可以選" + amount + "個");
		System.out.println(lottery);
	}

	// (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	public static void printSixLotteryNum() {
		System.out.println("阿文...請輸入討厭哪個數字,(輸入完印出6個可選號碼)");
		int dislikeNum = sc.nextInt();
		int[] numArray = new int[49];

		while (dislikeNum > 9 || dislikeNum < 1) {
			System.out.println("請輸入1~9");
			dislikeNum = sc.nextInt();
		}

		// 1~49符合條件的數字放進陣列，不符合把0放進去
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != dislikeNum && i / 10 != dislikeNum) {
				numArray[i - 1] = i;
			} else
				numArray[i - 1] = 0;
		}

//		解法: numArray[i] 讓i是一個隨機值，確保每次找到的數字都是陣列內不同元素
		int[] lotteryArray = new int[6]; // 裝選到的6個號碼以便做排序

		for (int i = 0; i < 6; i++) {
			int index = (int) (Math.random() * 49);

			while (numArray[index] == 0) { // 選到值=0，也就是不符合條件，重選
				index = (int) (Math.random() * 49);
			}

			lotteryArray[i] = numArray[index];
			numArray[index] = 0; // 避免下次再選到一樣的，選過就讓值等於0
		}

		Arrays.sort(lotteryArray);
		for (int i = 0; i < 6; i++) {
			System.out.print(lotteryArray[i] + " ");
		}

	}

}
