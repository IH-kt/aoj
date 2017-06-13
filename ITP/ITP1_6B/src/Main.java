import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		boolean[][] isHave = new boolean[4][13];
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		char[] suit = {'S', 'H', 'C', 'D'};
		String[] temp;
		int inttemp;

		for (int i = 0; i < n; i++) {
			temp = (sc.nextLine()).split(" ");
			inttemp = Integer.parseInt(temp[1]);

			switch(temp[0].charAt(0)) {
				case 'S':
					isHave[0][inttemp - 1] = true;
					break;
				case 'H':
					isHave[1][inttemp - 1] = true;
					break;
				case 'C':
					isHave[2][inttemp - 1] = true;
					break;
				case 'D':
					isHave[3][inttemp - 1] = true;
					break;
			}
		}

		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < 13; j++) {
				if (!isHave[i][j]) {
					System.out.println(suit[i] + " " + (j + 1));
				}
			}
		}

		sc.close();
	}

}
