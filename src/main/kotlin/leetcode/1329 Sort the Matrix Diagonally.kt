package leetcode

class `1329 Sort the Matrix Diagonally` {

    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        if (mat.size == 1 || mat[0].size == 1) {
            return mat
        }

        val diagonals = List<MutableList<Int>>(mat.size + mat[0].lastIndex) { mutableListOf() }

        var d = -1

        for (i in mat.lastIndex downTo 0) {
            var r = i
            var c = 0
            diagonals[++d].add(mat[r++][c++])
            repeat(minOf(mat.lastIndex - i, mat[0].lastIndex)) {
                diagonals[d].add(mat[r++][c++])
            }
        }
        for (i in 1 until mat[0].size) {
            var r = 0
            var c = i
            diagonals[++d].add(mat[r++][c++])
            repeat(minOf(mat[0].lastIndex - i, mat.lastIndex)) {
                diagonals[d].add(mat[r++][c++])
            }
        }

        diagonals.forEach { it.sort() }

        d = -1
        var e = 0

        for (i in mat.lastIndex downTo 0) {
            var r = i
            var c = 0
            mat[r++][c++] = diagonals[++d][e++]
            repeat(minOf(mat.lastIndex - i, mat[0].lastIndex)) {
                mat[r++][c++] = diagonals[d][e++]
            }
            e = 0
        }
        for (i in 1 until mat[0].size) {
            var r = 0
            var c = i
            mat[r++][c++] = diagonals[++d][e++]
            repeat(minOf(mat[0].lastIndex - i, mat.lastIndex)) {
                mat[r++][c++] = diagonals[d][e++]
            }
            e = 0
        }

        return mat
    }
}