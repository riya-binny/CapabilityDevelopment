package Data_Structures.Pallindrome;

public class Main {
    public static void main(String[] args) {
        Pallindrome pallindrome = new Pallindrome();
        // Find longest palindrome
        System.out.println(pallindrome.longestPalindrome("aabbccc"));

        // Count palindromic substrings
        System.out.println(pallindrome.countSubstrings("abc"));
    }
}
