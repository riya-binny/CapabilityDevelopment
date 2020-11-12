package LeetCode;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaac"));
    }

    private static String removeDuplicates(String S) {
        Boolean isRepeating = false;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                S = S.replace(S.substring(i, i + 2), "");
                isRepeating = true;
            }
        }
        if (isRepeating)
            return removeDuplicates(S);
        return S;
    }
}
