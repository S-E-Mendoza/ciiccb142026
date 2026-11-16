public class Task8 {

    public static int sumAll(int... numbers) {
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int cumulative = 0;

            for (int j = 1; j <= num; j++) {
                cumulative = cumulative + j;
            }

            System.out.println(
                    "Parameter " + (i + 1) + " = " + num + ", cumulative sum (1 to " + num + ") = " + cumulative);

            total = total + cumulative;
        }

        return total;
    }

    public static void main(String[] args) {
        int result = sumAll(4, 5, 10);
        System.out.println("Total of all cumulative sums = " + result);
    }

}