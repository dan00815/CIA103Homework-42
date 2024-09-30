package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8 {
//	請建立一個Collection物件並將以下資料加入:
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

//		印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======================================");

		Iterator itrt = list.iterator();
		while (itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		System.out.println("======================================");

		for (Object forEach_list : list) {
			System.out.println(forEach_list);
		}
		System.out.println();

//		移除不是java.lang.Number相關的物件，並且再印一次
		Iterator it2 = list.iterator();
		while (it2.hasNext()) {
			if (!(it2.next() instanceof Number)) {
				it2.remove();
			}
		}

		for (Object forEach_list : list) {
			System.out.println(forEach_list);
		}
		System.out.println("==============");

	}

}
