package Data_Structures.Stack;

public class Main {
    public static void main(String[] args) {
        // Remove outer parentheses
        RemoveParentheses removeParentheses = new RemoveParentheses();
        System.out.println(removeParentheses.removeOuterParentheses("(()())(())"));

        // Remove duplicate
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        System.out.println(removeDuplicate.removeDuplicates("deeedbbcccbdaa", 3));

    }
}
