package leetcode

class `567 Permutation in String` {

    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1sorted = s1.toList().sorted()
        for (i in 0 until s2.length - s1.lastIndex) {
            if (s2.substring(i, i + s1.length).toList().sorted() == s1sorted) {
                return true
            }
        }
        return false
    }
}