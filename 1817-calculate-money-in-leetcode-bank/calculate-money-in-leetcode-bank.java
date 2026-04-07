class Solution {
    public int totalMoney(int n) {
        int total=0;
        int weekDayStart=1;
        for(int i=1;i<=n;i++){
            total+=weekDayStart+(i-1)%7;
            if(i%7==0){
                weekDayStart++;
            }
        }
        return total;
        
    }
}