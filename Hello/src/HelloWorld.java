import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] arges) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Name");
		String name =scan.next();
		System.out.println("tttt Helo"+System.nanoTime()+name);
		scan.close();
	}

}
