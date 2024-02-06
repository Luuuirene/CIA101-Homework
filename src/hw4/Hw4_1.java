package hw4;

import java.util.Arrays;

public class Hw4_1 {
/*
 * 有個一維陣列如下：
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
(提示：陣列，length屬性)
 */
	public static void main(String[] args) {
		int sum = 0;
		// 陣列排序
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(intArray);  // 呼叫sort方法並傳入欲進行排序的陣列
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];	
			//System.out.print(intArray[i] + " "
		}
		int arraverage = sum / 10;
		System.out.print("{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}" + "\n" + "此陣列的平均值=" + arraverage);	
		System.out.print("\n" + "此陣列大於平均值的元素=");
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > arraverage ){
				System.out.print(intArray[i] + " ");
			}
		}
		
		
		
		
	}			
}
