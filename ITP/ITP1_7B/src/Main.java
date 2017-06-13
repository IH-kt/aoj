import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int counter = 0;
		
		while (n != 0 || x != 0) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == j) continue;
					for (int k = 1; k <= n; k++) {
						if (i == k || j == k) continue;
						if (i + j + k == x) {
							counter++;
						}
					}
				}
			}
			
			counter /= 6;
			System.out.println(counter);
			counter = 0;
			n = sc.nextInt();
			x = sc.nextInt();
		}
		
		sc.close();
	}

}
