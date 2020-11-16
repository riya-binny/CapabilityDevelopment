package Data_Structures.StringManipulationReversal;

public class ReverseNSubString {
    public void reverseWords(String sentence) {
        if (sentence == null || sentence.length() <= 1)
            System.out.println(sentence);
        String[] words = sentence.split("\\s");
        int endIndex = words.length - 1;
        for (int firstIndex = 0; firstIndex < endIndex; firstIndex++) {
            String temp = words[firstIndex];
            words[firstIndex] = words[endIndex];
            words[endIndex--] = temp;
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public String reverseStringRecursion(String input) {
        if (input == null || input.length() <= 1)
            return input;
        return reverseStringRecursion(input.substring(1)) + input.charAt(0);
    }

    public String reverseStringIteration(String input) {
        if (input == null || input.length() <= 1)
            return input;
        char[] letters = input.toCharArray();
        int endIndex = letters.length - 1;
        for (int firstIndex = 0; firstIndex < endIndex; firstIndex++) {
            char temp = letters[firstIndex];
            letters[firstIndex] = letters[endIndex];
            letters[endIndex--] = temp;
        }
        return new String(letters);
    }

    public Boolean isSubString(String string, String checkString) {
        if (string.equals(checkString))
            return true;
        int size = checkString.length();
        for (int i = 0; i <= string.length() - size; i++) {
            if (string.substring(i, i + size).equals(checkString))
                return true;
        }
        return false;
    }
}
