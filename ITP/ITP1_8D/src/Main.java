import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String input2 = sc.next();
		StringBuilder sb = new StringBuilder(input + input);
		
		int i;
		for (i = 0; i < input.length(); i++) {
			if (input2.equals(sb.substring(i, i+input2.length()))) break;
		}
		
		if (i == input.length()) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		sc.close();
	}

}