package hw10;

/*
 * 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
	為質數(提示：Math類別)
	質數只能被自己和1整除，因數個數為2
 */

public class Hw10_1 {
	
	public static int isPrime(int number) {
		
		int count = 0;
		
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		return count; //count=2，代表此數為質數
	}
	
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			int number = (int) (Math.random() * 100) + 1;
			
			if (isPrime(number)==2) { //確認isPrime方法返回的因數個數為2
				System.out.println(number + "是質數");
			} else {
				System.out.println(number + "不是質數");
			}
		}
	}
}
	
