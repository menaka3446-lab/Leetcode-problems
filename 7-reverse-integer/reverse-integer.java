class Solution {
    public int reverse(int x) {
        int sign=1;
        int answer=0;
        int i=0;
        while(x!=0)
        {
            int mod=x%10;
            if(answer>Integer.MAX_VALUE/10)return 0;
            if(answer<Integer.MIN_VALUE/10)return 0;
            answer=answer*10+mod;
            x/=10;

        }
        
        return answer;
       
        
    }
}