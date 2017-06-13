import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		int q = sc.nextInt();
		
		String temp;
		StringBuilder sbtemp;
		int a, b;
		
		for (int i = 0; i < q; i++) {
			temp = sc.next();
			a = sc.nextInt();
			b = sc.nextInt();
			if (temp.equals("print")){
				System.out.println(sb.substring(a, b+1));
			} else if (temp.equals("replace")) {
				sb.replace(a, b+1, sc.next());
			} else if (temp.equals("reverse")){
				sbtemp = new StringBuilder(sb.substring(a, b+1));
				sbtemp.reverse();
				sb.replace(a, b+1, sbtemp.toString());
			}
		}
	
		sc.close();
	}

}