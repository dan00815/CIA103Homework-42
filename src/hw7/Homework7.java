package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Homework7 {

	void hw7Item1() {
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//		Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		try {
			File file = new File("src/hw7/Sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str;
			int countChar = 0;
			int countLine = 0;

			while ((str = br.readLine()) != null) {
				countLine++;
				countChar += str.length();
			}

			System.out.println("Sample.txt檔案共有" + file.length() + "個位元組," + countChar + "個字元," + countLine + "列資料");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void hw7Item2() {
//		請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//		append功能讓每次執行結果都能被保存起來)
		try {
			FileOutputStream fo = new FileOutputStream("src/hw7/Data.txt", true);
			PrintStream ps = new PrintStream(fo);

			for (int i = 0; i < 10; i++) {
				int random = (int) (Math.random() * 1000) + 1;
				ps.print(random + ", ");
			}
			ps.println();

			ps.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	void copyFile(File file1, File file2) {
//		請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案
		try {
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(file2);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			String str;
			while ((str = br.readLine()) != null) {
				pw.println(str);
			}

			System.out.println("copy完畢");
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	void hw7Item4() {
		Cat cat = new Cat("Meow");
		Cat cat2 = new Cat("MeowWu");
		Dog dog = new Dog("Wang");
		Dog dog2 = new Dog("WangWang");
		Animal[] Animals = { cat, cat2, dog, dog2 };

		File dir = new File("C:/data");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File("C:/data/Object.ser");
		try {
			FileOutputStream fo = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			for (int i = 0; i < Animals.length; i++) {
				oos.writeObject(Animals[i]);
			}

			System.out.println("輸出完成");
			oos.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	void hw7Item5() {
		File file = new File("C:/data/Object.ser");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {
				((Animal) ois.readObject()).speak();
			}
//			ois.close();
//			fis.close();

		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
