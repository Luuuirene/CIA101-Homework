package hw3;

import java.util.Scanner;

public class Hw3_1_adv {

/*請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
	三角形、其它三角形或不是三角形，如圖示結果：
(提示：Scanner，三角形成立條件，判斷式if else)
(進階功能：加入直角三角形的判斷)
*/
	public static void main(String[] args) {
		System.out.println("請輸入三個整數:");
		
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		
		
		if(number1 == number2 && number1 == number3 && number2 == number3) {
			if(number1 == 0 && number2 == 0 && number3 == 0) {
				System.out.println("不是三角形");
			}else {
				System.out.println("正三角形");
			}
		} else if (number1 == number2 || number2 == number3 || number1 == number3) {
			System.out.println("等腰三角形");
		} else if(Math.pow(number1, 2) + Math.pow(number2, 2) == Math.pow(number3, 2)
			|| Math.pow(number2, 2) + Math.pow(number3, 2) == Math.pow(number1, 2)
			|| Math.pow(number1, 2) + Math.pow(number3, 2) == Math.pow(number2, 2)){
				System.out.println("直角三角形");
			}
		else {
			System.out.println("不是三角形");
		}
		
	}

}
