import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String W = sc.next();
		
		String temp = sc.next();
		int counter = 0;
		while (!temp.equals("END_OF_TEXT")) {
			if (temp.equalsIgnoreCase(W)) counter++;
			temp = sc.next();
		}
		
		System.out.println(counter);
		
		sc.close();
	}

}
