package hw2;

public class homework2_2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++ ) {
			int j = 1;
			while(j <= 9 ) {
			System.out.print(i + "x" + j + "=" + i * j + "\t");
			j++;
			}
		System.out.println(" ");
		}
		System.out.println("==============================");
		for(int i = 1; i <= 9; i++ ) {
			int j = 1;
			do {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			}while(j <= 9);
			System.out.println(" ");
		}
		System.out.println("==============================");
		int i = 1;
		while( i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				j++;
			}while(j <= 9);
			i++;
			System.out.println(" ");
		}
		
	}

}
