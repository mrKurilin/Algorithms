package leetcode

class `763 Partition Labels` {

    fun partitionLabels(s: String): List<Int> {
        var i = 0
        val strings = mutableListOf<String>()
        while (i < s.length) {
            val currentChar = s[i]
            var end = s.lastIndexOf(currentChar) + 1
            var currentString = s.substring(i..<end)
            outer@ while (true) {
                for (j in currentString.indices) {
                    val currentEnd = s.lastIndexOf(currentString[j]) + 1
                    if (currentEnd > end) {
                        end = currentEnd
                        currentString = s.substring(i..<currentEnd)
                        continue@outer
                    }
                }
                break@outer
            }
            strings.add(currentString)
            i = end
        }
        return strings.map { it.length }
    }
}