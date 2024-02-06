package hw4;

import java.util.Scanner;
public class Hw4_4 {
/*
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
表如下：
請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
員工編號: 25 19 27 共3 人!」
 */

	public static void main(String[] args) {
		
		int[][] array = {{25,32,8,19,27},
						{2500,800,500,1000,1200}};
		//System.out.println(array[0].length);
		System.out.println("請輸入欲借的金額:");
		Scanner sc= new Scanner(System.in);
		int money = sc.nextInt();
		int people = 0;
		
		
		System.out.println("有錢可借的員工編號:"); 
		for(int i = 0; i < array[1].length; i++) {    
			if(array[1][i] >= money) {
				System.out.print(array[0][i] + " ");
				people++;
			}else {
				continue;
			}
			
		}
		System.out.println("共" + people + "人!");
		
		sc.close();
		
	}
}
