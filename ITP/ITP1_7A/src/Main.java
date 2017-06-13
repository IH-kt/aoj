import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int midex;
		int finex;
		int reex;

		while(true) {

			midex = sc.nextInt();
			finex = sc.nextInt();
			reex  = sc.nextInt();
			
			if (midex == -1 && finex == -1 && reex == -1) break;
			
			if (midex == -1 || finex == -1) {
				System.out.println('F');
				continue;
			}

			if (midex + finex >= 80) {
				System.out.println('A');
			} else if (midex + finex >= 65) {
				System.out.println('B');
			} else if (midex + finex >= 50) {
				System.out.println('C');
			} else if (midex + finex >= 30) {
				if (reex >= 50) {
					System.out.println('C');
				} else {
					System.out.println('D');
				}
			} else {
				System.out.println('F');
			}
		}
		
		sc.close();
	}

}
