import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stinput;
		int a, b;
		int output = 0;
		
		out:while(true) {
			stinput = (sc.nextLine()).split(" ");
			a = Integer.parseInt(stinput[0]);
			b = Integer.parseInt(stinput[2]);
			
			switch(stinput[1].charAt(0)) {
			case '+':
				output = a + b;
				break;
			case '-':
				output = a - b;
				break;
			case '*':
				output = a * b;
				break;
			case '/':
				output = a / b;
				break;
			default:
				break out;
			}
			
			System.out.println(output);
		}
		
		sc.close();
	}

}
