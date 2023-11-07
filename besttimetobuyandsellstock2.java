public class besttimetobuyandsellstock2 {
    public int maxProfit(int[] prices) {
        int minsofar=Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;

        for(int i=0;i<prices.length;i++)
        {
            if(minsofar>prices[i])
            {
                minsofar=prices[i];

            }
            if(prices[i]>minsofar)
            {
                   profit=prices[i]-minsofar;
                   maxProfit+=profit;
                   minsofar=prices[i];
            }
        }
return maxProfit;
    }
    
}
