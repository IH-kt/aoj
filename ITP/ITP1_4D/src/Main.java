import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		long sum = 0;
		for (int val: array) {
			sum += val;
			if (val < min) {
				min = val;
			}
			if (val > max) {
				max = val;
			}
		}
		
		System.out.printf("%d %d %d\n", min, max, sum);
		
		sc.close();
	}

}
