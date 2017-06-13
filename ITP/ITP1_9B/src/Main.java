import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		int m;
		int h;
		
		while (!sb.toString().equals("-")) {
			m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				h = sc.nextInt();
				
				sb.append(sb.substring(0, h));
				sb.delete(0, h);
			}
			
			System.out.println(sb.toString());
			
			sb = new StringBuilder(sc.next());
		}
		
		sc.close();
	}

}
