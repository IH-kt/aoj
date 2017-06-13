import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[sc.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int i = array.length - 1;
		while(true) {
			System.out.print(array[i]);
			if (i == 0) {
				System.out.println();
				break;
			} else {
				System.out.print(' ');
				i--;
			}
		}
		
		sc.close();
	}

}
