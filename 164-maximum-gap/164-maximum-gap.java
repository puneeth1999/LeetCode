class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n < 2) return 0;
        int maxGap = 0; // If all the elements in nums are of same value.
        // find min and max;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        // Now that we have the min and max of the array, find the minimized max width we need.
        int g = (int)Math.ceil((double)(max - min)/(n - 1));
        // Creating buckets
        int[] minBucket = new int[n - 1]; Arrays.fill(minBucket, Integer.MAX_VALUE);
        int[] maxBucket = new int[n - 1]; Arrays.fill(maxBucket, Integer.MIN_VALUE);
        // determining where to insert the min and max values of each bucket.
        for(int i = 0; i < n; i++){
            if(nums[i] == max || nums[i] == min){
                continue;
            }
            int bucketIdx = (nums[i] - min) / g;
            minBucket[bucketIdx] = Math.min(minBucket[bucketIdx], nums[i]);
            maxBucket[bucketIdx] = Math.max(maxBucket[bucketIdx], nums[i]);
        }
        
        for(int i =0;i<n -1;i++){
            if(maxBucket[i]==Integer.MIN_VALUE) // empty buckets
                continue;
            maxGap = Math.max(minBucket[i] - min, maxGap);
            min = maxBucket[i];
        }

        maxGap = Math.max(maxGap, max-min);// 2
        return maxGap;
        
    }
}