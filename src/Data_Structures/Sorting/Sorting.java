package Data_Structures.Sorting;

import java.util.*;

public class Sorting {
    public void diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, Stack> map = new HashMap<>();

        // Creating map of diagonals
        for (int i = 0; i<n;i++){
            for (int j = 0;j<m;j++){
                if(!map.containsKey(i-j)) {
                    Stack<Integer> s = new Stack<Integer>();
                    s.push(mat[i][j]);
                    map.put(i-j,s);
                }
                else {
                    map.get(i-j).push(mat[i][j]);
                }
            }
        }

        // Sort the collection
        map.forEach((key,value) -> {
            Collections.sort(value, Collections.reverseOrder());
        });

        // New diagonaly sorted matrix
        for(int i = 0; i< n; i++) {
            for (int j = 0;j<m;j++){
                mat[i][j] = (int) map.get(i-j).pop();
            }
        }

        // Print
        for(int i = 0; i< n; i++) {
            for (int j = 0;j<m;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Merge
        for(int i = 0; i<n; i++){
            nums1[m + i] = nums2[i];
        }

        // Sort
        Arrays.sort(nums1);

        // Print
        for(int i = 0; i<m+n; i++)
            System.out.print(nums1[i] + " ");
    }
}
