package leetcode

class `278 First Bad Version` : VersionControl {

    override fun firstBadVersion(n: Int): Int {
        var l = 1L
        var r = n.toLong()
        while (l <= r) {
            val current = (r + l) / 2
            if (isBadVersion(current.toInt())) {
                r = current - 1
            } else {
                l = current + 1
            }
        }
        return l.toInt()
    }

    var badVersion: Int = 0

    override fun isBadVersion(n: Int) = n >= badVersion
}

interface VersionControl {

    fun firstBadVersion(n: Int): Int

    fun isBadVersion(n: Int): Boolean
}