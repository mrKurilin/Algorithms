class Woods() {
    fun main() {
        val (height, boardsCount) = readln().split(" ").map { it.toInt() }
        val boardLengths = readln().split(" ").map { it.toInt() }

        if (height == 1) {
            print(boardLengths.sum())
            return
        }

        if (height == boardsCount) {
            println(boardLengths.min())
            return
        }

        var minWidth = 1
        var maxWidth = 1000000001

        while (maxWidth - minWidth > 1) {
            val width = (maxWidth + minWidth) / 2

            if (isWidthOk(boardLengths, height, width)) {
                minWidth = width
            } else {
                maxWidth = width
            }
        }

        print(minWidth)
    }

    fun isWidthOk(
        boards: List<Int>,
        height: Int,
        width: Int
    ): Boolean {
        var level = 0
        var currentWidth = 0

        boards.forEach { board ->
            if (currentWidth < width) {
                currentWidth += board
            } else {
                currentWidth = board
                level++
            }
        }

        if (currentWidth >= width) level++

        return level >= height
    }
}