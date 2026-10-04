class Task_1_1_3 {
    public static void main(String[] args) {
        int check_number = 10;
        String message;
        while (check_number > 0) {
            message = (check_number % 2 == 0) ? check_number + " is even number" : check_number + " is odd number";
            System.out.println(message);
            check_number--;
        }

    }
}
