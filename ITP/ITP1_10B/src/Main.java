import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double C;
		a = sc.nextInt();
		b = sc.nextInt();
		C = sc.nextInt();
		C = Math.toRadians(C);
		
		double sin, cos, c, area, perimeter, height;
		sin = Math.sin(C);
		cos = Math.cos(C);
		
		c = Math.sqrt(a * a + b * b - 2 * a * b * cos);
		
		height = b * sin;
		area = a * height / 2;
		perimeter = a + b + c;

		System.out.println(area);
		System.out.println(perimeter);
		System.out.println(height);
		
		sc.close();
	}

}
