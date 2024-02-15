package hw5;


public class Hw5_5 {
/*
 * 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
此驗證碼內容包含了英文大小寫與數字的亂數組合，
 */
	public static void main(String[] args) {
		
		Hw5_5 code = new Hw5_5();
		System.out.println(code.genAuthCode());
	
	
	}
	

	public char[] genAuthCode() {
		char[] codeAuto = new char[8];
		String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		//使用Math.random()產生驗證碼
		//因charAt()方法，所以轉換為int整數
		for(int i = 0; i < codeAuto.length; i++) {
			codeAuto[i] = s.charAt((int)(Math.random()* s.length())+1);
		}
		return codeAuto;
	}
}

