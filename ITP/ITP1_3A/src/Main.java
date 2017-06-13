
public class Main {

	public static void main(String[] args) {
		String hello = "Hello World\n";
		StringBuilder sb = new StringBuilder(hello.length() * 1000);
		for (int i = 0; i < 1000; i++) {
			sb.append(hello);
		}
		
		System.out.print(sb.toString());
	}

}
