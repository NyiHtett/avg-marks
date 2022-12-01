import java.util.Scanner;

public class MarksApp {

	public static void main(String[] args) {
		System.out.println("*programmed to calculate average marks of three subjects");
		Scanner key = new Scanner(System.in);
		System.out.print("first subject: ");
		double a = key.nextDouble();
		System.out.print("second subject: ");
		double b = key.nextDouble();
		System.out.print("third subject: ");
		double c = key.nextDouble();
		Grade student = new Grade(a,b,c);
	}

}
