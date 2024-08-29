package hw4;

import java.util.Scanner;

public class Homework4 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		work1();
		System.out.println();
		work2();
		work3();
		work4();
		work5();
		work6();
	}

	public static void work1() {
//		第一題
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int arr1Sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr1Sum += arr[i];
		}
		double arrAverage = arr1Sum / arr.length;
		System.out.println(arrAverage);

		System.out.println("大於平均值的元素");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arrAverage) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void work2() {
//		第二題
//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
		String s = "Hello World";
		char[] reverseArray = new char[s.length()];
		char[] stringArray = s.toCharArray(); // 將字串轉換成一個char陣列

		for (int i = 0; i < stringArray.length; i++) {
			reverseArray[i] = stringArray[reverseArray.length - (i + 1)];
		}
		System.out.println(reverseArray);
	}

	public static void work3() {
//		第三題
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		int count = 0;
		char[] specialAlpha = { 'a', 'e', 'i', 'o', 'u' };
		String[] planetArray = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		for (int i = 0; i < planetArray.length; i++) {
			for (int j = 0; j < planetArray[i].length(); j++) {
				for (int k = 0; k < specialAlpha.length; k++) {
					if (planetArray[i].charAt(j) == specialAlpha[k]) {
						count++;
						break;
					}
				}
			}
		}

		System.out.println(count);
	}

	public static void work4() {
//		第四題
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事，有錢可借他
//		並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
		int[][] employee = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.println("輸入要借多少錢");
		int price = sc.nextInt();
		int empAmount = 0;
		System.out.print("可借的員工編號有");

		for (int i = 0; i < employee.length; i++) {
			if (employee[i][1] >= price) {
				empAmount++;
				System.out.print(employee[i][0] + " ");
			}
		}

		System.out.println("共" + empAmount + "人");
	}

	public static void work5() {
//		第五題
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		int dayCount = 0; // 算總共幾天
		System.out.println("輸入三個整數");
		int year = sc.nextInt(), month = sc.nextInt(), day = sc.nextInt();
		boolean leapYear = checkLeapYear(year); // 檢查閏年，是則回傳true
		int feb = leapYear ? 29 : 28;
		int[] dayArray = { 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

//		輸入錯誤資料就重輸入
		while (!check(month, day, dayArray)) {
			System.out.println("月份及日期輸入有誤，請再次輸入");
			month = sc.nextInt();
			day = sc.nextInt();
		}

		int[] date = { year, month, day }; // 5/20挑4個月+20天,(month-1)月+day

		for (int i = 0; i < month - 1; i++) {
			dayCount += dayArray[i];
		}
		System.out.println("輸入的日期為該年第" + (dayCount += day) + "天");
	}

	public static void work6() {
//		請算出每位同學考最高分的次數
		int[][] scoreArray = new int[7][];
		scoreArray[0] = new int[] { 10, 35, 40, 100, 90, 85, 75, 70 };
		scoreArray[1] = new int[] { 37, 75, 77, 89, 64, 75, 70, 95 };
		scoreArray[2] = new int[] { 100, 70, 79, 90, 75, 70, 79, 90 };
		scoreArray[3] = new int[] { 77, 95, 70, 89, 60, 75, 85, 89 };
		scoreArray[4] = new int[] { 98, 70, 89, 90, 75, 90, 89, 90 };
		scoreArray[5] = new int[] { 90, 80, 100, 75, 50, 20, 99, 75 };
		scoreArray[6] = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 }; // 8位同學得最高分的次數

		for (int i = 0; i < scoreArray.length - 1; i++) {
			int highestIndex = 0;
			for (int j = 0; j < scoreArray[i].length - 1; j++) {
				if (scoreArray[i][highestIndex] < scoreArray[i][j + 1]) {
					highestIndex = j + 1;
				}
			}
			scoreArray[6][highestIndex]++;
		}
		
		for (int i = 0; i < scoreArray[6].length; i++) {
			System.out.println((i + 1) + "號拿過" + scoreArray[6][i] + "次最高分");
		}
	}
	
	public static boolean checkLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("閏年");
			return true;
		}
		return false;
	}

	public static boolean check(int m, int d, int[] dArray) {
		if (m <= 0 || m > 12 || d <= 0 || d > dArray[m - 1]) {
			return false;
		}
		return true;
	}
}
