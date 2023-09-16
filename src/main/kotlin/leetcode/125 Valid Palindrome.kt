package leetcode

class `125 Valid Palindrome` {

    fun isPalindrome(s: String): Boolean {
        val list = mutableListOf<Char>()
        s.forEach {
            if (it.isLetterOrDigit()) {
                list.add(it.lowercaseChar())
            }
        }
        return isPalindrome(list)
    }

    fun <T> isPalindrome(s: List<T>): Boolean {
        for (i in s.indices) {
            if (s[i] != s[s.lastIndex - i]) {
                return false
            }
        }
        return true
    }
}