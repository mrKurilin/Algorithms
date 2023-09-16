package leetcode

class `657 Robot Return to Origin` {

    fun judgeCircle(moves: String): Boolean {
        val array = Array(2) { 0 }
        moves.forEach {
            when (it) {
                'R' -> array[0] -= 1
                'L' -> array[0] += 1
                'D' -> array[1] -= 1
                'U' -> array[1] += 1
                else -> array[0]
            }
        }
        return array[0] == 0 && array[1] == 0
    }
}