import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];
		int[] vector = new int[m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			vector[i] = sc.nextInt();
		}

		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				temp += matrix[i][j] * vector[j];
			}
			System.out.println(temp);
			temp = 0;
		}

		sc.close();
	}
}
