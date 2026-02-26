class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            if(helper(s.substring(left,right+1)))
            {
                count++;
                left=right+1;
            }
        }
        return count;
        
    }
    boolean helper(String s)
    {
        int rCharacter=0;
        int lCharacter=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                rCharacter++;
            }
           else if(s.charAt(i)=='L'){
                lCharacter++;
            }
        }
        if(rCharacter==lCharacter)
        {
            return true;
        }
        return false;
    }
}