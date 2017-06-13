import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] counter = new int[26];
		String input;
		
		while (sc.hasNext()) {
			input = (sc.nextLine()).toLowerCase();
			for (int i = 0; i < input.length(); i++) {
				if (Character.isLowerCase(input.charAt(i))) {
					counter[input.charAt(i) - 'a']++;
				}
			}
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.printf("%c : %d\n", 'a' + i, counter[i]);
		}
		
		sc.close();
	}

}