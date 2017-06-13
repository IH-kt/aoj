import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		call(sc.nextInt());
		
		sc.close();
	}
	
	public static void call(int n) {
		int i = 1;
		do {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			while(x != 0) {
				if (x % 10 == 3) {
					System.out.print(" " + i);
					break;
				}
				x /= 10;
			}
		} while(++i <= n);
		
		System.out.println();
	}
}
