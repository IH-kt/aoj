import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String taro, hanako;
		int ptaro = 0, phana = 0;
		
		int counter = 0;
		char tar, han;
		int tlen, hlen;
		for (int i = 0; i < n; i++) {
			taro = sc.next();
			hanako = sc.next();
			
			tlen = taro.length();
			hlen = hanako.length();
			while (counter < tlen && counter < hlen) {
				tar = taro.charAt(counter);
				han = hanako.charAt(counter);
				if (tar > han) {
					ptaro += 3;
					break;
				} else if (tar < han) {
					phana += 3;
					break;
				}
				counter++;
			}
			
			if (counter == tlen || counter == hlen) {
				if (tlen > hlen) {
					ptaro += 3;
				} else if (hlen > tlen) {
					phana += 3;
				} else {
					ptaro++;
					phana++;
				}
			}
			counter = 0;
			
		}
		
		System.out.println(ptaro + " " + phana);
		
		sc.close();
	}

}

