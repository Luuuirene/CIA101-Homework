package hw2;

public class homework2 {
	public static void main(String[] args) {
	// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for(int i = 2; i <= 1000; i+=2 ) {
			sum += i;
			}
		
		System.out.println("1～1000的偶數和=" + sum); 
		System.out.println("============ ");
		
	// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for(int i = 1; i <= 10; i++ ) {
			sum2 *= i;
			}
		
		System.out.println("1～10的連乘積=" + sum2); 
		System.out.println("============ ");
		
	// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int sum3 = 1;
		int j = 1;
		while( j <= 10) {
			sum3 *= j;
			j++ ;
		}
		
		System.out.println("1～10的連乘積=" + sum3); 
		System.out.println("============ ");
		
		
	// 請設計一隻Java程式，輸出結果為以下：
	// 1 4 9 16 25 36 49 64 81 100	
	// 1*1 2*2 ...10 *10
		for(int a = 1; a <= 10; a++ ) {
			System.out.print(a * a + " ");
		}
		System.out.println();
		System.out.println("============");
	//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
	// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
	// 4、14、24、34、40~49
	// 十位數:num / 10 == 4 個位數:num % 10 == 4
		int count = 0;
		System.out.print("阿文可以選擇的數字有：" );
		for(int lottery = 1; lottery <= 49 ; lottery++) {
			if(lottery / 10 != 4 && lottery % 10 != 4) {
			System.out.print( lottery + " ");
			count++;
			}	
		}
		System.out.println("");
		System.out.println("共有" + count + "個");
		
		System.out.println("============");
	/* 請設計一隻Java程式，輸出結果為以下：
		1 2 3 4 5 6 7 8 9 10   - 0 第一層(line) 10
		1 2 3 4 5 6 7 8 9      - 1 第二層 9
		1 2 3 4 5 6 7 8        - 2
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
	*/
		//int line = 10; //有10層
		int end = 11;
		for(int line = 1; line <= 10; line++) {
			for (int number = 1; number <= 10; number++ ) {
				if ( number <= end-line ) {
				System.out.print(number + " ");	
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
			
		System.out.println("============");
	/*
	請設計一隻Java程式，輸出結果為以下：
		A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF
	 */
		
	//int level = 1; //層數
	//int alphabet = 1; //*數	
		
		int alphabet = 65;
		for(int x = 0; x <= 5; x++) {
			for(int z = 0; z <= x ; z++) {
				System.out.print((char)(alphabet + x)); //或是可以寫(char)('A' + x) int -> char
			}
			System.out.println();
		}
		
		
	}
	
	

}
