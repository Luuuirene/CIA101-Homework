package hw7;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

/*
 * 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
代表的檔案會複製到第二個參數代表的檔案
 */

public class Hw7_3 {
	
	public void copyFile(File f1, File f2) throws Exception {
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int c;

		while ((c = br.read()) != -1) { 
			bw.write(c);
			bw.flush();
		}
		System.out.println("已複製完成~");
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Hw7_3 copy = new Hw7_3();
		File myFile1 = new File("D:\\CIA101_Workspace\\CIA10122-Homework\\src\\hw7\\Data.txt");
		File myFile2 = new File("D:\\CIA101_Workspace\\CIA10122-Homework\\src\\hw7\\Data2.txt");
		
		try {
			copy.copyFile(myFile1, myFile2);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	
	

}
