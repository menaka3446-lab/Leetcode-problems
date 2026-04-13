class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int result=0;
        int minimum=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                result=Math.abs(i-start);
                minimum=Math.min(result,minimum);
               
                
            }
        }
        return minimum;
        
    }
}