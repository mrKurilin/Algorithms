package leetcode

class `3 Longest Substring Without Repeating Characters` {

    fun lengthOfLongestSubstring(s: String): Int {
        val currentChars = mutableSetOf<Char>()
        var result = 0
        for (i in s.indices) {
            for (j in i..s.lastIndex) {
                if (!currentChars.add(s[j])) {
                    currentChars.clear()
                    break
                }
                if (currentChars.size > result) {
                    result = currentChars.size
                }
            }
        }
        return maxOf(result, currentChars.size)
    }
}