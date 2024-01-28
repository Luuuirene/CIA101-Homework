package hw3;

import java.util.Scanner;

public class Hw3_1 {

/*請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
	三角形、其它三角形或不是三角形，如圖示結果：
(提示：Scanner，三角形成立條件，判斷式if else)
(進階功能：加入直角三角形的判斷)
*/
	public static void main(String[] args) {
		System.out.println("請輸入三個整數:");
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int[3];
		for(int i = 0; i < number.length; i++) {
			if(sc.hasNextInt()) {
				number[i] = sc.nextInt();
			}
		}
		;
		
		if(number[0] == number[1] && number[0] == number[2]) {
			if(number[0] == 0 && number[1] == 0 && number[2] == 0) {
				System.out.println("不是三角形");
			}else {
			System.out.println("正三角形");
			}
		} else if (number[0] == number[1] && number[1] != number[2]) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("不是三角形");
		}
		
	}

}
