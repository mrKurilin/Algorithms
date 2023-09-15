package leetcode

class `242 Valid Anagram` {

    fun isAnagram(s: String, t: String): Boolean = s.toCharArray().sorted() == t.toCharArray().sorted()

}