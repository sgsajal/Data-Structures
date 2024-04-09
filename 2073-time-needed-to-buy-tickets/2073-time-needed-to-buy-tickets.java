class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans=0;
        int tick=tickets[k];
        for(int i=0;i<k;i++){
            if(tickets[i]>tick){
                ans+=tick;
            }
            else{
                ans+=tickets[i];
            }
        }
        ans+=tick;
        for(int i=k+1;i<tickets.length;i++){
            if(tickets[i]>=tick){
                ans+=tick-1;
            }
            else{
                ans+=tickets[i];
            }
        }
        return ans;
    }
}