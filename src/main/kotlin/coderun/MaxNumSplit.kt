class MaxNumSplit() {

    fun main() {
        val string = readln()

        val mutableList = string.map { it.toString() }.toMutableList()

        while (mutableList.contains("0")) {
            val index = mutableList.indexOf("0")
            mutableList[index - 1] += mutableList[index]
            mutableList.removeAt(index)
        }

        while (mutableList.size != mutableList.toSet().size) {
            val copy = mutableList.toList()
            for (i in copy.indices) {
                if (copy.count { it == copy[i] } > 1) {
                    mutableList[i] += mutableList[i + 1]
                    mutableList.removeAt(i + 1)
                    break
                }
            }
        }

        val copy = mutableList.toList().filter { it.matches(".+0".toRegex()) }

        for (i in copy.indices) {
            val stringy = copy[i]
            val stringWithOutZero = stringy.removeSuffix("0")
            if (mutableList.contains(stringWithOutZero)) {
                continue
            } else {
                val index = mutableList.indexOf(stringy)
                mutableList[index] = stringWithOutZero
                mutableList.add(index+1, "0")
                break
            }
        }

        print(mutableList.joinToString("-"))
    }
}