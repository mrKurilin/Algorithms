package leetcode

class `121 Best Time to Buy and Sell Stock` {

    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0
        var min = prices[0]
        var max = prices[0]
        var currentProfit = 0
        var maxProfit = 0
        prices.forEach { current ->
            if (current < min) {
                min = current
                max = current
                maxProfit = maxOf(currentProfit, maxProfit)
                currentProfit = 0
            } else if (current > max) {
                max = current
                currentProfit = max - min
                maxProfit = maxOf(currentProfit, maxProfit)
            }
        }
        return maxProfit
    }
}