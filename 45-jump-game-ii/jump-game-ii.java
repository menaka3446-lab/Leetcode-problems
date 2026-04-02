class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1)
        {
            return 0;
        }
        int jump=0;
        int end=0;
        int reach=0;
        for(int i=0;i<nums.length;i++)
        {
            reach=Math.max(i+nums[i],reach);
            if(i==end){
                jump++;
                end=reach;
                if(reach==nums.length-1)
                {
                    break;
                }
            }
        }
        return jump;
        
    }
}