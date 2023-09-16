package leetcode

class `93 Restore IP Addresses` {

    fun restoreIpAddresses(s: String): List<String> {
        if (s.length < 4) {
            return emptyList()
        }

        val result = mutableSetOf<String>()

        addRest(s.first().toString() + ".", s, result)

        if (s.first() != '0') {
            addRest(s.substring(0..1) + ".", s, result)
            if (s.substring(0..2).toInt() <= 255) {
                addRest(s.substring(0..2) + ".", s, result)
            }
        }

        return result.toList()
    }

    private fun addRest(prefix: String, s: String, set: MutableSet<String>) {
        val current = s.removePrefix(prefix.replace(".", ""))

        if (prefix.count { it == '.' } > 3 || current.isBlank()) {
            if (prefix.count { it == '.' } == 4 && current.isBlank()) {
                set.add(prefix.removeSuffix("."))
            }
            return
        }

        if (current.first() == '0' || current.length == 1) {
            val newValue = prefix + current.first() + "."
            addRest(newValue, s, set)
        } else {
            var newValue = prefix + current.first() + "."
            addRest(newValue, s, set)
            newValue = prefix + current.substring(0..1) + "."
            addRest(newValue, s, set)
            if (current.length >= 3) {
                val firstThreeChars = current.substring(0..2)
                if (firstThreeChars.toInt() <= 255) {
                    newValue = prefix + firstThreeChars + "."
                    addRest(newValue, s, set)
                }
            }
        }
    }
}
