import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int counter = 0;
		
		while(true) {
			if ((input=sc.nextInt()) == 0) {
				break;
			}
			
			counter++;
			System.out.printf("Case %d: %d\n", counter, input);
		}
		
		sc.close();
	}

}
