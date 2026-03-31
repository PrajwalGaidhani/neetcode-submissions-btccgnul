class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        i=0
        j=1
        current_profit=0
        max_profit=0
        while i<j and j<len(prices):
            current_profit=prices[j]-prices[i]
            print(current_profit,prices[i],prices[j])
            if current_profit<0:
                current_profit=0
                i=j
            max_profit=max(max_profit,current_profit)
            j+=1
        return max_profit