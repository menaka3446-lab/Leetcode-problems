class Solution {
    public int dominantIndex(int[] nums) {
        int answer=0;
        int index=-1;
        int maximumNumber=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(maximumNumber<nums[i])
            {
                maximumNumber=nums[i];
                index=i;
            }
            
            System.out.println(index);
            
        }
        for(int i=0;i<nums.length;i++)
        {
            if(index==i)
            {
                continue;
            }
            if(nums[i]*2>maximumNumber)
            {
                return -1;
            }
        }
        return index;

        
    }
}