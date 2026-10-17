class UseStringB {
    public static void main(String[] args) {
        String input = "Sharmaine";
        String reverseInput = new StringBuilder(input).reverse().toString();
        String isPalindrome = input.equals(reverseInput) ? "Yes, input is a palindrome."
                : "No, input is not a palindrome.";
        System.out.println(isPalindrome);
    }
}