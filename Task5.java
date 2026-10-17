import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter last number: ");
        int number3 = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(number1);
        arr.add(number2);
        arr.add(number3);
        String largest = arr.get(0) > arr.get(1) && arr.get(0) > arr.get(2) ? "The largest number is: " + arr.get(0)
                : (arr.get(1) > arr.get(0) && arr.get(1) > arr.get(2)) ? "The largest number is: " + arr.get(1)
                        : (arr.get(2) > arr.get(0)
                                && arr.get(2) > arr.get(1))
                                        ? "The largest number is: " + arr.get(2)
                                        : (arr.get(0) == arr.get(1) && arr.get(0) == arr.get(2)
                                                || arr.get(1) == arr.get(0) && arr.get(1) == arr.get(2)
                                                || arr.get(2) == arr.get(0) && arr.get(2) == arr.get(1))
                                                        ? "All entered numbers are equal."
                                                        : "";
        System.out.println(largest);
    }
}