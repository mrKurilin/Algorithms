package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FirstBadVersionTest {

    @Test
    fun test1() {
        val firstBadVersion = `278 First Bad Version`()
        firstBadVersion.badVersion = 4
        Assertions.assertEquals(
            4,
            firstBadVersion.firstBadVersion(5)
        )
    }

    @Test
    fun test2() {
        val firstBadVersion = `278 First Bad Version`()
        firstBadVersion.badVersion = 1
        Assertions.assertEquals(
            1,
            firstBadVersion.firstBadVersion(1)
        )
    }

    @Test
    fun test3() {
        val firstBadVersion = `278 First Bad Version`()
        firstBadVersion.badVersion = 4
        Assertions.assertEquals(
            4,
            firstBadVersion.firstBadVersion(5)
        )
    }

    @Test
    fun test9() {
        val firstBadVersion = `278 First Bad Version`()
        firstBadVersion.badVersion = 2
        Assertions.assertEquals(
            2,
            firstBadVersion.firstBadVersion(3)
        )
    }


}