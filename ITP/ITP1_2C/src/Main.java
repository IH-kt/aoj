import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		int i = 0;
		while(true) {
			System.out.print(array[i]);
			i++;
			if (i >= array.length) {
				break;
			}
			System.out.print(' ');
		}
		System.out.println();
		
		sc.close();
	}
}
