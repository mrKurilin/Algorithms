package leetcode

class `438 Find All Anagrams in a String` {

    fun findAnagrams(s: String, p: String): List<Int> {
        val sortedP = p.toList().sorted()
        var l = 0
        var r = p.length
        val result = mutableListOf<Int>()

        while (r <= s.length) {
            if (r - l == p.length) {
                if (s.substring(l, r).toList().sorted() == sortedP) {
                    result.add(l)
                }
            }

            if (r != s.length && !sortedP.contains(s[r])) {
                l = ++r
                r = l + p.length
                continue
            } else {
                l++
                r++
            }
        }

        return result
    }
}