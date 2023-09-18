package basis

class BinarySearch {

    fun <T : Comparable<T>?> binarySearch(sortedArray: Array<T>, element: T): Int {
        var left = 0
        var right = sortedArray.lastIndex
        while (left <= right) {
            val middle = (left + right) / 2
            val current = sortedArray[middle]
            val compareResult = current?.compareTo(element) ?: error("Should not be here")
            if (compareResult == 0) {
                return middle
            } else if (compareResult < 0) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return -1
    }
}