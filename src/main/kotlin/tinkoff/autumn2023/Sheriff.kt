package tinkoff.autumn2023

class Sheriff {

    fun main() {
        val letters = readln().trim().toMutableList()
        var count = 0
        while (true) {
            if (
                letters.remove('s') &&
                letters.remove('h') &&
                letters.remove('e') &&
                letters.remove('r') &&
                letters.remove('i') &&
                letters.remove('f') &&
                letters.remove('f')
            ) {
                count++
            } else {
                break
            }
        }
        print(count)
    }
}