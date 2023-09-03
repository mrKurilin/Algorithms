package tinkoff.autumn2023

class Revolvers {

    fun main() {
        val (_, moneyCount) = readln().trim().split(" ").map { it.toInt() }
        val prices = readln().trim().split(" ").map { it.toInt() }.sorted()
        print(prices.lastOrNull() { it < moneyCount } ?: 0)
    }
}