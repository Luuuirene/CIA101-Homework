package hw5;

public class Work03 {
/*
 * 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
可以找出二維陣列的最大值並回傳，如圖：
 */
	public static void main(String[] args) {
		
		Work03 w = new Work03();
		
		int[][] intArray = {{1,6,3},{9,5,2}
		};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}
		};
		
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
				
		
	}
	//找出int陣列最大值
	public int maxElement(int x[][]) {
		int intMaxNumber = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > intMaxNumber) {
					intMaxNumber = x[i][j];
				}
			}
		}
		return intMaxNumber;
	}
	
	//找出double陣列最大值
	public double maxElement(double x[][]) {
		double doubleMaxNumber = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > doubleMaxNumber) {
					doubleMaxNumber = x[i][j];
				}
			}
		}
		return doubleMaxNumber;
	}
	
}
