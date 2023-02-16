import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("Enter the area of the circle: ");
		int radius = scan.nextInt();
		circle.setRadius(radius);
		System.out.printf("The area is: %s", circle.calcArea());
	}

}
