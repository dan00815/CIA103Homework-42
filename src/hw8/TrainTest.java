package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {
	public static void main(String[] args) {
		Train[] train = new Train[7];
		train[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		train[2] = new Train(118, "自強", "高雄", "台北", 500);
		train[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		train[4] = new Train(122, "自強", "台中", "花蓮", 600);
		train[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		train[6] = new Train(1254, "區間", "屏東", "基隆", 700);

//		請寫一隻程式,能印出不重複的Train物件
		System.out.println("印出不重複的Train物件．．．");
		Set<Train> trainSet = new HashSet<Train>();
		for (int i = 0; i < train.length; i++) {
			trainSet.add(train[i]);
		}

//		取值1
		for (Train tr : trainSet) {
			tr.getTrain();
		}
//		取值2
//		Iterator<Train> ite1 = trainSet.iterator();
//		while (ite1.hasNext()) {
//			ite1.next().getTrain();
//		}

		System.out.println("");

//		請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		System.out.println("印出由小到大排列的Train物件．．．");
		List<Train> trainList = new ArrayList<Train>();
		for (Train i : train) {
			trainList.add(i);
		}
		Collections.sort(trainList);
//		取值1
//		for (Train a : trainList) {
//			a.getTrain();
//		}
//		取值2
		Iterator<Train> ite2 = trainList.iterator();
		while (ite2.hasNext()) {
			ite2.next().getTrain();
		}
//		取值3
//		for (int i = 0; i < trainList.size(); i++) {
//			trainList.get(i).getTrain();
//		}

		System.out.println("");

//		承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		System.out.println("印出由小到大排列且不重複的Train物件．．．");
		Set<Train> trainTreeSet = new TreeSet<Train>();
		for (Train t : train) {
			trainTreeSet.add(t);
		}
//		取值1
		for (Train ta : trainTreeSet) {
			ta.getTrain();
		}
//		取值2
//		Iterator<Train> ite3 = trainTreeSet.iterator();
//		while (ite3.hasNext()) {
//			ite3.next().getTrain();
//		}

	}
}
