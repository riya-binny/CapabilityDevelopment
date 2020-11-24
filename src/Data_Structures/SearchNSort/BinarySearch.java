package Data_Structures.SearchNSort;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int first = 0, last = nums.length - 1;
        while(first <= last){
            int mid = (last - first) / 2 + first;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                first = mid + 1;
            } else{
                last = mid - 1;
            }
        }
        return -1;
    }
}
