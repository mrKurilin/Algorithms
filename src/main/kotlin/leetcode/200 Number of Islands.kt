package leetcode

class `200 Number of Islands` {

    fun numIslands(grid: Array<CharArray>): Int {
        val defaultArray = CharArray(grid[0].size) { '0' }
        var count = 0
        var flag = true

        while (flag) {
            var wasIsland = false
            for (row in grid.indices) {
                for (column in grid[0].indices) {
                    if (grid[row][column] == '1') {
                        setIsland(grid, row, column, defaultArray)
                        count++
                        wasIsland = true
                    }
                }
            }
            flag = wasIsland
        }
        return count
    }

    fun setIsland(grid: Array<CharArray>, row: Int, column: Int, defaultArray: CharArray) {

        if (row < 0 || column < 0 || row >= grid.size || column >= grid[0].size) {
            return
        }

        grid[row][column] = '0'

        val topValue = grid.getOrElse(row - 1) { defaultArray }.getOrElse(column) { '0' }
        if (topValue == '1') {
            setIsland(grid, row - 1, column, defaultArray)
        }

        val bottomValue = grid.getOrElse(row + 1) { defaultArray }.getOrElse(column) { '0' }
        if (bottomValue == '1') {
            setIsland(grid, row + 1, column, defaultArray)
        }

        val leftValue = grid.getOrElse(row) { defaultArray }.getOrElse(column - 1) { '0' }
        if (leftValue == '1') {
            setIsland(grid, row, column - 1, defaultArray)
        }

        val rightValue = grid.getOrElse(row) { defaultArray }.getOrElse(column + 1) { '0' }
        if (rightValue == '1') {
            setIsland(grid, row, column + 1, defaultArray)
        }
    }
}
