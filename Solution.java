class Solution {
    public int buyChoco(int[] prices, int money) {
        int[] min = {101, 101};
        for(int i = 0; i < prices.length; i++){
            if(prices[i] <= min[0]){
                min[1] = min[0];
                min[0] = prices[i];
                continue;
            }

            if(prices[i] <= min[1]){
                min[1] = prices[i];
            }
        }

        if(min[0] + min[1] <= money){
            return money - (min[0] + min[1]);
        }

        return money;
    }
}
