import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        int sum = Math.addExact(a, b);
        return sum;
    }

    public static int subtract(int a, int b) {
        int difference = Math.subtractExact(a, b);
        return difference;
    }

    public static int multiply(int a, int b) {
        int product = Math.multiplyExact(a, b);
        return product;
    }

    public static float divide(int a, int b) {
        float quotient = (float) Math.floorDiv(a, b);
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println("Addition: 10 + 5 = " + add(10, 5));
        System.out.println("Subtraction: 10 - 5 = " + subtract(10, 5));
        System.out.println("Multiplication: 10 * 5 = " + multiply(10, 5));
        System.out.println("Division: 10 / 5 = " + divide(10, 5));

        System.out.println();

        System.out.println("Addition: 25 + 17 = " + add(25, 17));
        System.out.println("Subtraction: 25 - 17 = " + subtract(25, 17));
        System.out.println("Multiplication: 25 * 17 = " + multiply(25, 17));
        System.out.println("Division: 25 / 17 = " + divide(25, 17));

        System.out.println();

        System.out.println("Addition: -8 + 3 = " + add(-8, 3));
        System.out.println("Subtraction: -8 - 3 = " + subtract(-8, 3));
        System.out.println("Multiplication: -8 * 3 = " + multiply(-8, 3));
        System.out.println("Division: -8 / 3 = " + divide(-8, 3));
    }
}
