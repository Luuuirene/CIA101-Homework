package hw9;

public class Hw9_2 {
	
	public static void main(String[] args) {
		Account account = new Account(); // 建立帳戶物件
		Mom mom = new Mom(account); // 建立媽媽執行緒
		Son son = new Son(account); // 建立熊大執行緒
		mom.start(); 
		son.start(); 
		
	}
}	
	
class Account{
	
	private int balance = 0; //存款餘額
	
	public Account() {
		
	}
	
	//媽媽進行存款
	synchronized public void deposit(int money) { //餘額超過3000元,就會停止匯款給熊大
		while (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				System.out.println("熊大被老媽告知帳戶已經有錢!");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("媽媽存了：" + money + "；帳戶共有：" + balance);
		notify(); //喚醒爭奪執行緒
	}
	
	//熊大進行提款
	synchronized void withdraw(int money) {
		//帳戶餘額低於熊大要提款的金額,熊大就會暫停提款
        while (balance == 0) {
        	System.out.println("熊大看到帳戶沒錢，暫停提款");
            try {
            	System.out.println("媽媽被熊大要求匯款!");
                wait();
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
        }
        balance -= money;
        System.out.println("熊大領了：" + money + "；帳戶共有" + balance);

        if (balance < 2000) {
            System.out.println("熊大看到餘額低於2000，要求匯款");
            notify();
        }
    }
	
}
	
	// 媽媽執行存款
	class Mom extends Thread {
		Account account;

		public Mom(Account account) {
			this.account = account;
		}

		public void run() {
			for (int i = 1; i <= 10; i++) {
				account.deposit(2000); // 每次存款2000元
			}
		}
	}

	// 熊大執行緒，執行提款操作
	class Son extends Thread {
		Account account;

		public Son(Account account) {
			this.account = account;
		}

		public void run() {
			for (int i = 1; i <= 10; i++) {
				account.withdraw(1000); // 每次提款一千元
			}
		}
	}



