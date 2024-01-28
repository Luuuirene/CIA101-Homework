package hw3;

import java.util.Scanner;
import java.util.Random;
public class Hw3_2 {
/* 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
對則顯示正確訊息，如圖示結果：
提示：Scanner，亂數方法，無窮迴圈)
(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        int ans = ran.nextInt(10); //產生一個亂數
        
        System.out.println("請猜一個0～9的數字~");
        for(;;) {
        	int guess = sc.nextInt();
        	if (guess == ans) {
        		System.out.println("猜對了!答案是" + ans);
        		break;
        	} else if(guess > ans) {
        		System.out.println("猜錯囉了!答案比你猜的數字還要小");
        		continue;
        	} 
        	else {
        		System.out.println("猜錯囉了!答案比你猜的數字還要大");
        		continue;
        	}
        	
        	
        }
	}
}
