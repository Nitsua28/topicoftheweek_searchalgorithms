package topicoftheweek_searchalgorithms;

class Solution {
    public static int binarySearch(int[] nums, int target) {
        int lIndex = 0;
        int rIndex = nums.length - 1;

        while (lIndex <= rIndex){
            int mid = lIndex + (rIndex - lIndex) / 2;

            if (nums[mid] == target){
                return mid;
            }

            if (nums[mid]< target){
                lIndex = mid + 1;
                
            } 
            else{
                rIndex =  mid - 1; 
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {4};
        int n = arr.length;
         
        int x = 4;
 
        int index = binarySearch(arr, x);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}