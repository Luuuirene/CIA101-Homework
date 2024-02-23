package hw8;
//請寫一隻程式，能印出不重複的Train物件
//練習各種取值寫法，如迭代器、for迴圈或foreach等
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw8_2 {
	
	public static void main(String[] args) {
		
		Set<Train> set = new HashSet<Train>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
	
		//取值:迭代器
		Iterator<Train> objs = set.iterator();
		while (objs.hasNext()) {
			Train train = objs.next();
			System.out.println(train);
		}
		System.out.println("===================");	
		
		//取值:增強for; ;for循環不能在Set系列使用
		for(Train train : set) {
			System.out.println(train);
		}
	
	
	
	
	}

}
