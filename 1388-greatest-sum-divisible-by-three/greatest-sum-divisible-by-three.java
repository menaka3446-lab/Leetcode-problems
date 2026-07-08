class Solution {
    public int maxSumDivThree(int[] nums) {

        int[] dp=new int[3];
        dp[0]=0;
        dp[1]=Integer.MIN_VALUE;
        dp[2]=Integer.MIN_VALUE;
        

        for(int num:nums){
            int[] temp=dp.clone();
            for(int i=0;i<3;i++){
                if(temp[i]==Integer.MIN_VALUE){
                    continue;
                }
                int sum=temp[i]+num;
            int rem=sum%3;
            dp[rem]=Math.max(dp[rem],sum);


            }
            

        }
        return dp[0];
    }
}