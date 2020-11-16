package Data_Structures.StringManipulationReversal;

public class Main {
    public static void main(String[] args) {
        ReverseNSubString reverseNSubString = new ReverseNSubString();

        // String reversal using recursion
        System.out.println(reverseNSubString.reverseStringRecursion("hello"));

        // String reversal using iteration
        System.out.println(reverseNSubString.reverseStringIteration("riya"));

        // Checking whether one string is substring of another
        System.out.println(reverseNSubString.isSubString("hllo", "hello"));

        // Reverse words in a sentence
        reverseNSubString.reverseWords("Hello my name is Riya");
    }
}
