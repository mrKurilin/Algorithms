package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ATMTest {

    @Test
    fun test1() {
        val atm = `2241 Design an ATM Machine`()
        atm.deposit(intArrayOf(0, 0, 1, 2, 1))
        val first = atm.withdraw(600)
        atm.deposit(intArrayOf(0, 1, 0, 1, 1))
        val second = atm.withdraw(600)
        val third = atm.withdraw(550)

        assertEquals(
            intArrayOf(0, 0, 1, 0, 1).joinToString(),
            first.joinToString()
        )
        assertEquals(
            intArrayOf(-1).joinToString(),
            second.joinToString()
        )
        assertEquals(
            intArrayOf(0, 1, 0, 0, 1).joinToString(),
            third.joinToString()
        )
    }

    @Test
    fun test2() {
        val atm = `2241 Design an ATM Machine`()
        atm.deposit(intArrayOf(0, 10, 0, 3, 0))
        val first = atm.withdraw(500)

        assertEquals(
            intArrayOf(0, 2, 0, 2, 0).joinToString(),
            first.joinToString()
        )
    }
}