import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		System.out.printf("%d %d\n", length * width,
						  2 * length + 2 * width);
		
		sc.close();
	}

}