package leetcode

class `2241 Design an ATM Machine` {

    private val banknotes = Array(5) { 0L }

    fun deposit(banknotesCount: IntArray) {
        banknotesCount.forEachIndexed { index, count ->
            banknotes[index] += count.toLong()
        }
    }

    fun withdraw(amount: Int): IntArray {
        val result = Array(5) { 0L }
        var currentAmount = amount.toLong()

        if (currentAmount >= 500 && banknotes[4] > 0) {
            result[4] += minOf(banknotes[4], currentAmount / 500)
            currentAmount -= result[4] * 500
        }

        if (currentAmount >= 200 && banknotes[3] > 0) {
            result[3] += minOf(banknotes[3], currentAmount / 200)
            currentAmount -= result[3] * 200
        }

        if (currentAmount >= 100 && banknotes[2] > 0) {
            result[2] += minOf(banknotes[2], currentAmount / 100)
            currentAmount -= result[2] * 100
        }

        if (currentAmount >= 50 && banknotes[1] > 0) {
            result[1] += minOf(banknotes[1], currentAmount / 50)
            currentAmount -= result[1] * 50
        }

        if (currentAmount >= 20 && banknotes[0] > 0) {
            result[0] += minOf(banknotes[0], currentAmount / 20)
            currentAmount -= result[0] * 20
        }

        var currentBanknotesAmount = 0L
        result.forEachIndexed { index, i ->
            currentBanknotesAmount += when (index) {
                0 -> 20 * i
                1 -> 50 * i
                2 -> 100 * i
                3 -> 200 * i
                4 -> 500 * i
                else -> 0
            }
        }

        return if (currentBanknotesAmount == amount.toLong()) {
            banknotes[4] -= result[4]
            banknotes[3] -= result[3]
            banknotes[2] -= result[2]
            banknotes[1] -= result[1]
            banknotes[0] -= result[0]
            result.map { it.toInt() }.toIntArray()
        } else {
            intArrayOf(-1)
        }
    }
}