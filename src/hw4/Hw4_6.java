package hw4;

public class Hw4_6 {
/*
 * 班上有8位同學，他們進行了6次考試結果如下：
 * 請算出每位同學考最高分的次數
 */
	public static void main(String[] args) {
		
		int[][] scores = {{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
				  		{ 37, 75, 77, 89, 64, 75, 70, 95 },
				  		{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				  		{ 77, 95, 70, 89, 60, 75, 85, 89 },
				  		{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				  		{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		
	
		
		//取出8位學生每次考試最高分
		int[] highCount = new int[8];
		
		for(int i = 0; i < scores.length; i++) {
			int maxscore = getMaxium(scores[i]);
		}
		for(int i = 0 ; i < scores.length ; i++) {
			for(int j = 0 ; j < scores[i].length ; j++) {
				if(scores[i][j] == getMaxium(scores[i])) {
					highCount[j]++;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < scores[0].length ; i++) {
			System.out.println((i+1)+"號學生共考了"+ highCount[i]+"次最高分");
		}
	}
	
	
		
		//取出每次考試最高分
		public static int getMaxium(int[] array) {
			
			int max = array[0]; //設定初始的最大值
			
			for(int i = 1 ; i < array.length; i++) {
				if(array[i] > max) {
					max = array[i];
				}
			}
			return max;
			
		}
		
		

}
