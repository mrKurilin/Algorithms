package leetcode

class `234 Palindrome Linked List` {

    fun isPalindrome(head: ListNode?): Boolean {
        val list = mutableListOf<Int>()

        var currentListNode = head
        do {
            list.add((currentListNode!!.`val`))
            currentListNode = currentListNode.next
        } while (currentListNode != null)

        return isPalindrome(list)
    }

    fun isPalindrome(s: List<Int>): Boolean {
        for (i in s.indices) {
            if (s[i] != s[s.lastIndex - i]) {
                return false
            }
        }
        return true
    }
}

class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)