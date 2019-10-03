package pl.pawtel.palindromeCheck;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        String reverse = new StringBuilder(word).reverse().toString().toLowerCase();
        //    throw new UnsupportedOperationException("Waiting to be implemented.");
        if (word.toLowerCase().equals(reverse)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
