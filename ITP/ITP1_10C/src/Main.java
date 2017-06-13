import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] x, y;
		x = new int[n];
		y = new int[n];
		
		int[] D = new int[n];

		for (int i = 0; i < x.length; i++) x[i] = sc.nextInt();
		for (int i = 0; i < y.length; i++) y[i] = sc.nextInt();
		for (int i = 0; i < D.length; i++) {
			D[i] = (int)Math.abs(x[i] - y[i]);
		}
		
		double D1 = 0, D2 = 0, D3 = 0, Dinf = D[0];
		
		for (int i = 0; i < D.length; i++) {
			D1 += D[i];
			D2 += D[i] * D[i];
			D3 += D[i] * D[i] * D[i];
			if (D[i] > Dinf) {
				Dinf = D[i];
			}
		}
		D2 = Math.sqrt(D2);
		D3 = Math.cbrt(D3);
		
		System.out.println(D1);
		System.out.println(D2);
		System.out.println(D3);
		System.out.println(Dinf);
		
		sc.close();
	}

}
