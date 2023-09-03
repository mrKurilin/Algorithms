package tinkoff.autumn2023

class WinCards {

    fun main() {
        val cardsCount = readln().trim().toInt()
        val initCards = readln().trim().split(" ").map { it.toInt() }
        val winCards = readln().trim().split(" ").map { it.toInt() }

        if (initCards == winCards) {
            print("YES")
            return
        }

        var startIndex = 0
        var endIndex = cardsCount - 1

        for (i in initCards.indices) {
            if (initCards[i] == winCards[i]) {
                continue
            } else {
                startIndex = i
                break
            }
        }

        for (i in cardsCount - 1 downTo 0) {
            if (initCards[i] == winCards[i]) {
                continue
            } else {
                endIndex = i
                break
            }
        }

        val sortedCards = if (endIndex == cardsCount - 1) {
            initCards.subList(0, startIndex) + initCards.subList(startIndex, cardsCount - 1).sorted()
        } else {
            initCards.subList(0, startIndex) + initCards.subList(startIndex, endIndex + 1).sorted() + initCards.subList(
                endIndex + 1,
                cardsCount
            )
        }

        if (
            sortedCards == winCards
        ) {
            print("YES")
            return
        }

        print("NO")
    }
}