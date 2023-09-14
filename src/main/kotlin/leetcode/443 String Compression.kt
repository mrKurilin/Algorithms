package leetcode

class `443 String Compression` {

    fun compress(chars: CharArray): Int {
        var resultString = chars[0].toString()
        var currentCount = 1
        for (i in 1..chars.lastIndex) {
            if (chars[i] == chars[i - 1]) {
                currentCount++
            } else {
                if (currentCount > 1) {
                    resultString += currentCount.toString()
                }
                resultString += chars[i]
                currentCount = 1
            }
        }
        if (currentCount > 1) {
            resultString += currentCount.toString()
        }
        resultString.forEachIndexed { i, char ->
            chars[i] = char
        }
        return resultString.length
    }
}