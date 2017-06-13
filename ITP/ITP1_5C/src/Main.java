import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean isIgetaLine = true;
		boolean isIgeta = isIgetaLine;
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
					if (isIgeta) {
						sb.append('#');
					} else {
						sb.append('.');
					}
					isIgeta = !isIgeta;
				}
				
				sb.append('\n');
				isIgetaLine = !isIgetaLine;
				isIgeta = isIgetaLine;
			}
			
			System.out.println(sb.toString());
			sb.delete(0, H * (W + 1));
			isIgetaLine = true;
			isIgeta = isIgetaLine;
		}
		sc.close();
	}

}