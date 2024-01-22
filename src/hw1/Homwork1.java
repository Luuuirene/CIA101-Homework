package hw1;

public class Homwork1 {
	public static void main(String[] args) {
		System.out.println("12,6的和="+ (6 + 12) + ";" + "12,6的積="+ 6 * 12);
		System.out.println("==========");
		
		System.out.println("200顆蛋共是" + 200 / 12 + "打" + 200 % 12 + "顆" );
		
		System.out.println("==========");
		
		int s = 256559;
		int day = s / 86400;
		int hour = (s % 86400) / 3600;
		int min = (s % 86400) % 3600 / 60;
		int lasts = (s % 86400) % 3600 % 60;
		System.out.println("256559秒為" + day + "天" + hour + "小時" + min + "分" + lasts + "秒"  );
		
		System.out.println("==========");
		
		final double PI = 3.1415;
		int ra = 5;
		double circlearea = ra * ra * PI;
		double circumference =  ra*2*PI;
		System.out.printf("半徑為5的圓面積= %.4f",circlearea);
		System.out.printf(";圓周長= %.4f",circumference);
		System.out.println();
		
		System.out.println("==========");
		
		int money = 1500000;
		double r = 0.02;
		int year = 10;
		double half = Math.pow((1+r),year);
		double fv = money * half;
		System.out.printf("共有 %.2f",fv );
		System.out.print("元" + "\n");
		
		System.out.println("==========");
		
		System.out.println(5 + 5); // 都是int型別，會進行算術運算子，數字相加
		System.out.println(5 + '5'); // '5'對應Unicode，表示為'\u0035'，要從十六進位變為十進位，等於53，因此輸出為5+53=58
		System.out.println(5 + "5"); // "5"雙引號是String字串，不會和前面的5相加，獨立輸出為5
		
	}

}
