
// Program to calculate simple interest
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        System.out.println("Interest amount: " + interest);
        System.out.println("Total amount after " + time + " years: " + totalAmount);

        scanner.close();
    }
}{

}
