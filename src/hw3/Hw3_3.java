package hw3;

import java.util.Scanner;
public class Hw3_3 {
/*阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
的號碼與總數，如圖：
(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
*/
	public static void main(String[] args) {
		int count = 0;
		System.out.println("請輸入你討厭的數字(1~9):");
		
		Scanner sc = new Scanner(System.in);
		int hateNum = sc.nextInt();
		if(hateNum < 1 || hateNum > 9) {
			System.out.println("輸入錯誤，請輸入1~9其中一個數字");
			return;	
		}
		
		
		for(int lott = 1; lott <= 49 ; lott++) {
			if(lott / 10 != hateNum && lott % 10 != hateNum) {
			System.out.print( lott + " ");
			count++;
			}
			
		}
		
		System.out.println("\n可以選擇的號碼共有" + count + "個");
		
	}

	

}


