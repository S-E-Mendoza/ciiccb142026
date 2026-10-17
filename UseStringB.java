class UseStringB {
    public static void main(String[] args) {
        String input = "Sharmaine";
        String reverse = new StringBuilder(input).reverse().toString();
        String isPalindrome = input.equals(reverse) ? "Yes, input is a palindrome." : "No, input is not a palindrome.";
        System.out.println(isPalindrome);
    }
}