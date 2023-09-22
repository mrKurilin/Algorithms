package leetcode

class `20 Valid Parentheses` {

    fun isValid(s: String): Boolean {
        var currentS = s
        while (true) {
            val newS = currentS
                .replace("()", "")
                .replace("{}", "")
                .replace("[]", "")
            if (newS.length == 0) {
                return true
            }
            if (newS == currentS) {
                return false
            }
            currentS = newS
        }
    }
}