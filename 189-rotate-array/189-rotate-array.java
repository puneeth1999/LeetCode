class Solution {
    public void rotate(int[] nums, int k) {
        /*
         * Solution: reverse every integer in the array, reverse the kth section again
         * and reverse the remaining section as well.
         */
        int len = nums.length;
        k = k % len; // In case k > nums.length
        // Reverse the whole array
        nums = reverseArray(nums, 0, len - 1);
        // Reverse the first slice of the array
        nums = reverseArray(nums, 0, k-1);
        // Reverse the remaining slice of the array
        //if (k < len - 1)
            nums = reverseArray(nums, k, len - 1);
    }
    public static int[] reverseArray(int[] array, int start, int end) {
        int i = start, j = end;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}