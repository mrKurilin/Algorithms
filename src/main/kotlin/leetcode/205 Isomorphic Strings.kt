package leetcode

class `205 Isomorphic Strings` {

    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>()
        val usedChars = mutableSetOf<Char>()
        t.forEachIndexed { index, c ->
            if (map.containsKey(c)) {
                if (map[c] != s[index]) {
                    return false
                }
            } else {
                map[c] = s[index]
                if (!usedChars.add(s[index])) {
                    return false
                }
            }
        }
        return true
    }
}
