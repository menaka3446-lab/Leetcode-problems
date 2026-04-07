class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> stack=new Stack<>();
        int[] answer=new int[temperatures.length];
        int i=0;
        int index=0;
        for( i=0;i<n;i++ )
        {
         while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()] )

            {
                index=stack.pop();
                answer[index]=i-index;
            }
            stack.push(i);
        }
        return answer;
        
    }
}