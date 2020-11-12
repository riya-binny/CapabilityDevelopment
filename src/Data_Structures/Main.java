package Data_Structures;

public class Main {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        System.out.println("duplicate characters are: " + stringManipulation.duplicate("hello world"));
        System.out.println("first unique character is: " + stringManipulation.firstUnique("hello world"));
    }
}
