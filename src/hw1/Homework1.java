package hw1;

public class Homework1 {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println("12+6 = " + (12 + 6));
		System.out.println("12x6 = " + (12 * 6));

//		請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		System.out.println("200顆蛋是" + egg / 12 + "打" + egg % 12 + "顆");

//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int time = 256559, day, hour, min, sec;
		day = time / 86400;
		time %= 86400;
		hour = time / 3600;
		time %= 3600;
		min = time / 60;
		sec = time %= 60;
		System.out.println("256559秒為" + day + "天" + hour + "小時" + min + "分" + sec + "秒");

//		請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double circleArea = Math.pow(5, 2) * PI;
		double circlePerimeter = 2 * 5 * PI;
		System.out.println("圓面積 = " + circleArea);
		System.out.println("圓周長 = " + circlePerimeter);

//		某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		// FV ＝ PV×（1 ＋ R）* n次方 : PV本金 R利率
		int PV = 1500000;
		System.out.println((int)(PV * Math.pow(1.02f, 10)));

//		請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		並請用註解各別說明答案的產生原因
//		5 + 5 	
//		5 + ‘5’ 
//		5 + "5" 
		System.out.println(5 + 5); // 整數相加
		System.out.println(5 + '5'); // '5'會被轉換成ASCII的53進行加法，所以答案是58
		System.out.println(5 + "5");// 整數加字串，會被轉換為字串串接，前面的5會變成"5"與後面的"5"串接
	}

}
