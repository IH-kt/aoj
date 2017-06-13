import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int counter = 0;
		
		for (; a <= b; a++) {
			if (c % a == 0) counter++;
		}
		
		System.out.println(counter);
		
		sc.close();
	}

}
