class Solution {
    public int trap(int[] height) {
        // Store the max_height on the left side of the current bar
        int[] left_max = new int[height.length];
        left_max[0] = height[0];
        for(int i = 1; i < left_max.length; i++){
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }
        
        for(int i = 0; i < left_max.length; i++){
            // int x = Math.max(height[i], left_max[i - 1]);
            System.out.print(left_max[i] + " ");
        }
        
        // Store the max_height on the right side of the current bar
        int[] right_max = new int[height.length];
        right_max[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i>=0; i--){
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }
        
        System.out.println();
        for(int i = 0; i < right_max.length; i++){
            
            System.out.print(right_max[i] + " ");
        }
        
        int ans = 0;
        // find the #units of water that current bar can store with the help of left_max and right_max bar.
        for(int i = 0; i < height.length; i++){
            ans += (Math.min(right_max[i], left_max[i]) - height[i]);
        }
        
        return ans;
    }
}