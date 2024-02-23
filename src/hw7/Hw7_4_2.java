package hw7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
型簡化本題的程式設計)
 */

public class Hw7_4_2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/data/Object.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
		
        try{
        	while(true) {
        		//Object readObject()的回傳型態為Object，必須自行強迫轉型為原來寫出時的物件型態
        		((Object) ois.readObject()).speak(); //執行speak()方法，
        	}
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
        ois.close();
		fis.close();
	}

}
