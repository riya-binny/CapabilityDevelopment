package Data_Structures.Sorting;


public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
        Sorting sorting = new Sorting();

        int[] array1 = {1, 2, 3, 0, 0, 0};
        int[] array2 = {2,5,6};

        // Sort the Matrix Diagonally
        sorting.diagonalSort(mat);

        // Merge sorted array
        sorting.merge(array1, 3, array2, 3);
    }
}
