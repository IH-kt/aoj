import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX_STR = 112;
		String[] temp = new String[MAX_STR + 1];
		int x;
		StringBuilder sb;
		int sum;
		
		while (true) {
			sb = new StringBuilder(sc.nextLine());
			if (sb.length() > 9) {
				for (int i = 0; sb.length() != 0; i++) {
					if (sb.length() > 8) {
						temp[i] = sb.substring(0, 9);
						sb.delete(0, 9);
					} else {
						temp[i] = sb.substring(0, sb.length()%10);
						sb.delete(0, sb.length()%10);
					}
				}
			} else {
				temp[0] = sb.toString();
			}
			sum = 0;
			
			for (int i = 0; temp[i] != null; i++) {
				x = Integer.parseInt(temp[i]);
				temp[i] = null;
				while (x != 0) {
					sum += x % 10;
					x /= 10;
				}
			}

			if (sum == 0) {
				break;
			}
			
			System.out.println(sum);
		}
	
		sc.close();
	}

}