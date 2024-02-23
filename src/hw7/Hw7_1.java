package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/*
 * 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
 */

public class Hw7_1 {
	public static void main(String args[]) throws IOException {
		int character = 0;
		int line = 0;
		String str;
		
		try {
		File myFile = new File("D:\\CIA101_Workspace\\CIA10122-Homework\\src\\hw7\\Sample.txt");
		FileReader fr = new FileReader(myFile);  
		BufferedReader br = new BufferedReader(fr);
		
		
		//readLine():讀一整行，會轉換成String字串。檢查條件是否為空值
		while((str = br.readLine()) != null) {
			character += str.length();
			line++;
			}

		System.out.println(myFile.getName() + "檔案中共有" + myFile.length() + "個位元組" + character + "個字元" + line + "列資料");	
			
			 br.close();   
             fr.close();
         }catch (IOException e) {
            	 
         }
	
		
	}

}
