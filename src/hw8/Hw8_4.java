package hw8;
//承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件

import java.util.TreeSet;
import java.util.Iterator;


public class Hw8_4 {
	
public static void main(String[] args) {
		
		TreeSet<Train> tset = new TreeSet<Train>();
		tset.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		tset.add(new Train(1254, "區間", "屏東", "基隆", 700));
		tset.add(new Train(118, "自強", "高雄", "台北", 500));
		tset.add(new Train(1288, "區間", "新竹", "基隆", 400));
		tset.add(new Train(122, "自強", "台中", "花蓮", 600));
		tset.add(new Train(1222, "區間", "樹林", "七堵", 300));
		tset.add(new Train(1254, "區間", "屏東", "基隆", 700));
	
		//取值:迭代器
		Iterator<Train> objs = tset.iterator();
		while (objs.hasNext()) {
			Train train = objs.next();
			System.out.println(train);
		}
		System.out.println("===================");	
		
		//取值:增強for; for循環不能在Set系列使用
		for(Train train : tset) {
			System.out.println(train);
		}
	
	
	
	
	}

}
