class Solution {
    public boolean splitString(String s) {
        int n=s.length();
        long num=0;
        for(int i=0;i<n-1;i++)
        {
           num=num*10+(s.charAt(i)-'0');
            if(helper_dfs(s,i+1,num,1))
            {
                return true;
            }
        }
        return false;
        
    }

    private boolean helper_dfs(String s,int index,long previous,int count)
    {
        if(index==s.length())
        {
            return count>=2;
        }
        long num=0;
        for(int i=index;i<s.length();i++)
        {
            num=num*10+(s.charAt(i)-'0');
            if(num==previous-1)
            {
                if(helper_dfs(s,i+1,num,count+1))
                {
                    return true;
                }
            }
            if(num>=previous)
            {
                break;
            }
        }
        return false;

    }
}