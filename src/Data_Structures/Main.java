package Data_Structures;

public class Main {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        // Print duplicate characters from string
        System.out.println("duplicate characters are: " + stringManipulation.duplicate("hello world"));

        // Find first non-duplicate character of string
        System.out.println("first unique character is: " + stringManipulation.firstUnique("hello world"));
    }
}
