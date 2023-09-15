package leetcode

class `680 Valid Palindrome II` {

    fun validPalindrome(s: String): Boolean {
        if (s == s.reversed()) {
            return true
        }

        for (i in 0..s.lastIndex / 2) {
            if (s[i] == s[s.lastIndex - i]) {
                continue
            } else {
                return if (s[i] != s[s.lastIndex - i - 1] && s[i + 1] != s[s.lastIndex - i]) {
                    false
                } else {
                    (s.removeRange(i, i + 1) == s.removeRange(i, i + 1).reversed()
                            ||
                            s.removeRange(i + 1, i + 2) == s.removeRange(i + 1, i + 2).reversed()
                            ||
                            s.removeRange(s.lastIndex - i - 1, s.length - i - 1) == s.removeRange(
                        s.lastIndex - i - 1,
                        s.length - i - 1
                    ).reversed()
                            ||
                            s.removeRange(s.lastIndex - i, s.length - i) == s.removeRange(s.lastIndex - i, s.length - i)
                        .reversed())
                }
            }
        }

        return false
    }
}