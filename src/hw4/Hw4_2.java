package hw4;

public class Hw4_2 {

/* 請建立一個字串，經過程式執行後，輸入結果是反過來的
例如String s = “Hello World”，執行結果即為dlroW olleH
(提示：String方法，陣列)

//方法:ToCharArray() 將字串轉為字串數組
*/
	public static void main(String[] args) {
		String s = "Hello World"; //11位
		char[] helloArray = s.toCharArray();
		
		for (int i = 0; i < helloArray.length / 2; i++) {
	        // 交換左右兩邊的字符
	        char temp = helloArray[i]; //建立臨時的陣列
	        helloArray[i] = helloArray[helloArray.length - 1 - i];
	        helloArray[helloArray.length - 1 - i] = temp;
	    }
		String reserved = new String(helloArray);
		System.out.print(reserved);
	}
					
}
