package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
	年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
 */

public class Hw10_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日，例如20220202):");
		String date = sc.next();

		while (!date.matches("^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$")) {//0[1-9]|[12][0-9]:第一位為0，第二位為0-9;或是第一位為1-2，第二位為0-9
			System.out.println("日期格式不正確，請再輸入一次!");
			System.out.println("請輸入日期(年月日，例如20220202):");
			date = sc.next();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date dat = null;
		try {
			dat = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("請輸入欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年，三選一:");
		int chooseNum = sc.nextInt();

		while (!(chooseNum == 1 || chooseNum == 2 || chooseNum ==3)) {
			System.out.println("輸入錯誤，請重新選擇其一數字 (1)年/月/日(2)月/日/年(3)日/月/年");
			chooseNum = sc.nextInt();
		}
		

		switch (chooseNum) {
		case 1:
			System.out.println(sdf1.format(dat));
			break;
		case 2:
			System.out.println(sdf2.format(dat));
			break;
		case 3:
			System.out.println(sdf3.format(dat));
			break;
		}
		sc.close();
	}
	

}
