package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Hw8_1 {
	/*
	 * 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
• 移除不是java.lang.Number相關的物件
• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
	 */
	public static  void main(String[] args) {
		List<Object> list =  new ArrayList<Object>();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(new Short((short) 100));
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		System.out.println("1. Iterator印出");
		
		Iterator<Object> it = list.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		
		System.out.println("\n" + "2. 傳統for循環印出");
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.print(obj + " ");
		}
		
		System.out.println("\n" + "3. foreach循環印出");
		for(Object obj : list)
			System.out.print(obj + " ");
		
		System.out.println("\n" +"=====================");
		
		//移除不是java.lang.Number相關的物件
		Iterator<Object> itremove = list.iterator();
		while (itremove.hasNext()) {
			Object obj = itremove.next();
			if(obj instanceof Number) {
			System.out.print(obj + " ");
		
			}
		}
			
	}
}
