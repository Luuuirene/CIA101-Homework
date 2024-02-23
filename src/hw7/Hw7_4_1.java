package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
 */

public class Hw7_4_1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/data");
		if(!file.exists()) {
			file.mkdir();
		}
		File myfile = new File("C:\\data\\Object.ser");
		
		Object[] obj = new Object[4];
		obj[0] = new Dog("小小白");
		obj[1] = new Dog("小小黑");
		obj[2] = new Cat("捲捲");
		obj[3] = new Cat("彎彎");
		
		FileOutputStream fos = new FileOutputStream(myfile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i = 0; i < obj.length; i++) {
			oos.writeObject(obj[i]);
		}
		oos.close();
		fos.close();
		
	}

}
