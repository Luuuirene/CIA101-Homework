package hw10;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
	(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖(提示： TestFormatter.java, Java API
	文件, 判斷數字可用正規表示法)
 */

public class Hw10_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字：");
		String str = sc.next();
		
		// 使用正規表示法判斷輸入的內容否為數字
		while(!str.matches("-?\\d+(\\.\\d+)?")) {
			System.out.println("數字格式不正確，請再輸入一次!");
			System.out.println("請輸入數字：");
			str = sc.next();
		}
		
		double inputNum = Double.parseDouble(str);
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.##%");
		DecimalFormat df3 = new DecimalFormat("0.##E0");
		
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號，三選一：");
		int choose = sc.nextInt();
		while(!(choose ==1 || choose ==2 || choose==3)) {
			System.out.println("輸入錯誤，請重新輸入要格式化的模式(輸入數字)!");
			System.out.println("(1)千分位(2)百分比(3)科學記號：");
			choose = sc.nextInt();
		}
		
		switch(choose) {
		case 1:
			System.out.println(df1.format(inputNum));
			break;
		case 2:
			System.out.println(df2.format(inputNum));
			break;
		case 3:
			System.out.println(df3.format(inputNum));
			break;
		}
		sc.close();
	}
	

}
