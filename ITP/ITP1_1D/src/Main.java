import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		sb.append(input / 3600);
		input %= 3600;
		sb.append(':');
		sb.append(input / 60);
		input %= 60;
		sb.append(':');
		sb.append(input);
		
		System.out.println(sb);
		sc.close();
	}

}