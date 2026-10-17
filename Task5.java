import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter last number: ");
        int number3 = scanner.nextInt();
        int arr[] = { number1, number2, number3 };
        String largest = arr[0] > arr[1] && arr[0] > arr[2] ? "The largest number is: " + arr[0]
                : (arr[1] > arr[0] && arr[1] > arr[2]) ? "The largest number is: " + arr[1]
                        : (arr[2] > arr[0]
                                && arr[2] > arr[1])
                                        ? "The largest number is: " + arr[2]
                                        : (arr[0] == arr[1] && arr[0] == arr[2] || arr[1] == arr[0] && arr[1] == arr[2]
                                                || arr[2] == arr[0] && arr[2] == arr[1]) ? "All numbers are equal."
                                                        : "";
        System.out.println(largest);
    }
}