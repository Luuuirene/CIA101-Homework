package hw4;

public class Hw4_3 {
/*
 * 有個字串陣列如下(八大行星)：
{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
(提示：字元比對，String方法)
 */
	public static void main(String[] args) {
		String[] star = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		
		for(int i = 0; i < star.length; i++) { //分別列出八大行星的名稱
			for (int j = 0; j < star[i].length(); j++) {//傳回八大行星每一個字串長度(字元數量) ;star[i].length() 方法調用
				switch(star[i].charAt(j)) {
				case'a','e','i','o','u':
					count++;
				}
			}
		}
		System.out.println("八大行星母音之數量(a,e,i,o,u)共有" + count + "個");
	
	}
}
