package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.io.IOException;

/*
 * 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
append功能讓每次執行結果都能被保存起來)
 */

public class Hw7_2 {
	public static void main(String[] args) throws IOException {
		
		File myFile = new File("D:\\CIA101_Workspace\\CIA10122-Homework\\src\\hw7\\Data.txt");
		FileOutputStream fos = new FileOutputStream(myFile, true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        PrintStream ps = new PrintStream(bos);
        
        for(int i = 0; i < 10; i++) {
        	int random =(int)( Math.random() * 1000 + 1);
        	ps.println(random);
        }
        ps.close();
		bos.close();
		fos.close();
        
        System.out.println("亂數產生完成" + "\n" + "=============");
        
        
        
	}

}
