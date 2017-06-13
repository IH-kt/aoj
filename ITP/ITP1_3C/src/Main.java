import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stinput;
		int input1, input2;
		
		while(true) {
			stinput = (sc.nextLine()).split(" ");
			input1 = Integer.parseInt(stinput[0]);
			input2 = Integer.parseInt(stinput[1]);
			
			if (input1 == 0 && input2 == 0) {
				break;
			}
			
			if (input1 <= input2) {
				System.out.println(stinput[0] + " " + stinput[1]);
			} else {
				System.out.println(stinput[1] + " " + stinput[0]);
			}
		}
		
		sc.close();
	}

}
