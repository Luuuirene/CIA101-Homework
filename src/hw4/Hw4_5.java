package hw4;
import java.util.Scanner;
public class Hw4_5 {
/*
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
(提示1：Scanner，陣列)
(提示2：需將閏年條件加入)
(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
 */
//閏年:(1)年份能被4整除，但不能被100整除; (2)能被400整除
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個年份(西元年):");
		int year = sc.nextInt();
		System.out.println("請輸入一個月份:");
		int month = sc.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("月份輸入錯誤，請輸入正確的月份(1~12月)");
			return;
		}
		
		System.out.println("請輸入一個日期:");
		int day = sc.nextInt();
		//大小月之天數判定
		switch(month) {
		case 1,3,5,7,8,10,12:
			while(day > 31 || day < 1) {
				System.out.println("日期輸入錯誤，請輸入正確的日期(1~31日)");
				day = sc.nextInt();	
			}break;
		case 4,6,9,11:
			while(day > 30 || day < 1) {
				System.out.println("日期輸入錯誤，請輸入正確的日期(1~31日)");
				day = sc.nextInt();	
			}break;	
				
		}
		
		//閏年判定
		if(month == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			if(day < 1 || day > 29) {
				System.out.println("日期輸入錯誤，請輸入正確的日期(1~29日)");
				return;
			}
		}else if (month == 2 && !(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) { //非閏年
			if(day < 1 || day > 28) {
				System.out.println("日期輸入錯誤，請輸入正確的日期(1~28日)");
				return;
		}
			
		//累積計算月份之天數
		int totalMonth = 0;
		//非閏年
		int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//閏年
		int[] notnormalYear = {31, 29, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30};

		//輸入的月份不能計算天數
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			for(int i = 0; i < month-1 ; i++) {
				totalMonth += normalYear[i];
			}
		}else {
			for(int i = 0; i < month-1 ; i++) {
				totalMonth += notnormalYear[i];
			}
		}
		
		int sum = 0;
		sum += totalMonth + day;
		System.out.println("輸入的日期為該年的第" + sum + "天");
			
		}
		
	}
		
		
}
	
