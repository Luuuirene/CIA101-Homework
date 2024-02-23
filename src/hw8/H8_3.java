package hw8;

//請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class H8_3 {
public static void main(String[] args) {
		
		ArrayList<Train> list = new ArrayList<Train>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
	
		Collections.sort(list);
		
		//取值:迭代器
		Iterator<Train> objs = list.iterator();
		while (objs.hasNext()) {
			Train train = objs.next();
			System.out.println(train);
		}
		System.out.println("===================");	
		
		//取值:增強for
		for(Train train : list) {
			System.out.println(train);
		}
		System.out.println("===================");
		
		//取值:for循環
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	
	
	
	
	}

}
