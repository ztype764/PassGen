import java.util.Scanner;

public class generatepass {
private static Scanner s;

public static void main(String[] args) {
	s = new Scanner(System.in);
	System.out.print("Required Length for password:");
	int length=s.nextInt();
	System.out.println("Random Password generated:");
	System.out.println(gen.pass(length));
}
}
