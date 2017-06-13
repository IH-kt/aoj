import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int H;
		int W;
		
		while(true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					sb.append('#');
				}
				sb.append('\n');
			}
			
			System.out.println(sb.toString());
			sb.delete(0, H * (W + 1));
		}
		sc.close();
	}

}
