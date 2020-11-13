package Data_Structures.StringManipulationDuplicates;

public class Main {
    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        // Print duplicate characters from string
        System.out.println("duplicate characters are: " + duplicates.duplicate("h"));

        // Find first non-duplicate character of string
        System.out.println("first unique character is: " + duplicates.firstUnique("h"));
    }
}
