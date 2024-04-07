package hw9;

public class Hw9_1 implements Runnable{
	
	int counter = 1;
	String name; //參賽者name
	
	public Hw9_1() { // 建構者函數
		
	}
	
	public Hw9_1(String name) { //初始化參賽者name
		this.name = name;
	
	}

	@Override
	public void run() {
		while (counter <= 10) {
			System.out.println(name + "吃第" + counter + "碗飯");
			counter++;

			try {
				long time = (long)(Math.random()*2500) + 500;//Sleep時間由亂數產生500～3000之間的毫秒數
				Thread.sleep(time); 
			} catch (Exception e) {
			}
			
		}
		System.out.println(name + "吃完了!");
	}
	
	public static void main(String arg[]) {
        System.out.println("-----大胃王快食比賽開始!------");
        // 創立兩個執行緒，代表兩位參賽者
        Thread t1 = new Thread(new Hw9_1("饅頭人"));
        Thread t2 = new Thread(new Hw9_1("詹姆士"));
        //// 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
        t1.start(); // 啟動第一個執行緒
        t2.start(); // 啟動第二個執行緒

        try {
            // 等待兩個執行緒執行完畢
        	//因join方法，等run方法都跑完了，才去執行下面的輸出
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-----大胃王快食比賽結束!------");
    }
	
	

}
