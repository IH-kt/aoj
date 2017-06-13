import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		char temp;
		for (int i = 0; i < sb.length(); i++) {
			temp = sb.charAt(i);
			if (Character.isUpperCase(temp)) {
				temp = Character.toLowerCase(temp);
				sb.setCharAt(i, temp);
			} else if (Character.isLowerCase(temp)) {
				temp = Character.toUpperCase(temp);
				sb.setCharAt(i, temp);
			}
		}
		
		System.out.println(sb.toString());
	
		sc.close();
	}

}