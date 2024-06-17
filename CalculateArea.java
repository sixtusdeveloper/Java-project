import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}
