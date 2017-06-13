import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] residence = new int[4][3][10];
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			residence[sc.nextInt( ) - 1][sc.nextInt() - 1][sc.nextInt() - 1]
				+= sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					sb.append(' ');
					sb.append(residence[i][j][k]);
				}
				sb.append('\n');
			}
			if (i < 3) sb.append("####################\n");
		}
		System.out.print(sb.toString());
		sc.close();
	}

}
