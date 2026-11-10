import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        int fNumber = scanner.nextInt();
        System.out.println("Enter another whole number:");
        int sNumber = scanner.nextInt();

        int sum = Sum(fNumber, sNumber);
        int difference = Subtract(fNumber, sNumber);
        int product = Multiply(fNumber, sNumber);
        int quotient = Divide(fNumber, sNumber);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }

    final static int Sum(int fNumber, int sNumber) {
        return fNumber + sNumber;
    }

    final static int Subtract(int fNumber, int sNumber) {
        return fNumber - sNumber;
    }

    final static int Multiply(int fNumber, int sNumber) {
        return fNumber * sNumber;
    }

    final static int Divide(int fNumber, int sNumber) {
        return fNumber / sNumber;
    }

}