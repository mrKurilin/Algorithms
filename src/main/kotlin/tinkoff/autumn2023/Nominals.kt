package tinkoff.autumn2023

class Nominals {

    fun main() {
        val (necessaryCount, _) = readln().trim().split(" ").map { it.toInt() }
        val nominals = readln().trim().split(" ").map { it.toInt() }.toMutableList()
        nominals += nominals

        val numbers = getNumbers(necessaryCount, nominals)

        if (numbers.isEmpty()) {
            print(-1)
        } else {
            println(numbers.count())
            print(numbers.joinToString(" "))
        }
    }

    fun getNumbers(target: Int, list: List<Int>): List<Int> {
        if (target == 0 || target < 0) {
            return emptyList()
        }

        if (list.contains(target)) {
            return listOf(target)
        }

        for (number in list) {
            val newList = list.toMutableList()
            newList.remove(number)
            val result = getNumbers(target - number, newList)
            if (result.isEmpty()) {
                continue
            } else {
                return listOf(number) + result
            }
        }

        return emptyList()
    }
}