import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		
		System.out.printf("%f %f",
							input * input * Math.PI,
							2 * input * Math.PI);
		
		sc.close();
	}

}
