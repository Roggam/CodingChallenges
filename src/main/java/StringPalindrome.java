public class StringPalindrome {
    public static void main(String args[]) {
        System.out.println("Is aaa palindrom?: " + isPalindromeString("aaa"));
        System.out.println("Is abc palindrom?: " + isPalindromeString("abc"));
        System.out.println("Is bbbb palindrom?: " + isPalindromeString("bbbb"));
        System.out.println("Is defg palindrom?: " + isPalindromeString("defg"));
    }

    /**
     * Java method to check if given String is Palindrome *
     * @param text * @return true if text is palindrome, otherwise false
     */
    public static boolean isPalindromeString(String text) {
        String reverse = reverse(text);
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    }


    /**
     * Java method to reverse String using recursion *
     * @param input * @return reversed String of input
     */
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }
}



