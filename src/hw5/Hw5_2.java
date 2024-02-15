package hw5;

public class Hw5_2 {
/*
 * 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中
 * 取平均值並印出這10個亂數與平均值，如圖：
 */
	public static void main(String[] args) {
		randAvg();
		
	}
	
	public static void randAvg() {
		int sum = 0;
		
		System.out.println("本次亂數結果:");
		for(int i = 0; i < 10; i++) {
			int randomNumber = (int)(Math.random()*100)+1;//產生0-100的亂數
			System.out.print(randomNumber + " ");
			sum += randomNumber;
		}
		
		//計算亂數平均值
		double average = (double)sum / 10;
		System.out.print("\n" + "平均值 = " + average);
	}
	
	
}
