class Solution {
    public int mirrorDistance(int n) {

        int copy=n;
        int reverse=0;
        while(copy!=0)
        {
            int modulas=copy%10;
            reverse=reverse*10+modulas;
            copy=copy/10;
        }
        return Math.abs(reverse-n);

        
    }
}