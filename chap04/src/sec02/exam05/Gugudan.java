package sec02.exam05;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int dan = sc.nextInt();

		for(int j=2; j<=9; j++) {
			if(j%2!=0) {
				continue;
			}
			for(int i=1; i<=9; i++) {
				System.out.println( j + "*" + i + "="+ (j*i));
				if(i>=5) {
					break;
				}
			}
			System.out.println();
			
		}

	}

}
