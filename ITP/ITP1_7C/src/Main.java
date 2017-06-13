import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] array = new int[r][c];
		int[] sumOfRow = new int[r];
		int[] sumOfColumn = new int[c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sumOfRow[i] += array[i][j];
				sumOfColumn[j] += array[i][j];
			}
		}
		
		int sum = 0;
		for (int i = 0;; i++) {
			if (i == r) {
				for (int j = 0; j < c; j++) {
					System.out.print(sumOfColumn[j] + " ");
					sum += sumOfColumn[j];
				}
				System.out.println(sum);
				break;
			}
			for (int j = 0;; j++) {
				if (j == c) {
					System.out.println(sumOfRow[i]);
					break;
				} else {
					System.out.print(array[i][j]);
				}
				System.out.print(' ');
			}
		}
		
		sc.close();
	}

}
