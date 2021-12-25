class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return returnArray(l, r);
            } else if (sum < target){
                l++;
            } else {
                r--;
            }
        }
        return returnArray(l, r);
    }
    public int[] returnArray(int i, int j){
        int[] arr = new int[2];
        arr[0] = i+1; arr[1] = j+1;
        return arr;
    }
}