package leetcode

class `692 Top K Frequent Words` {

    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val set = words.toMutableSet().map { word -> Word(word, words.count { word == it }) }
        val comparator = Comparator<Word> { a, b ->
            return@Comparator if (a.frequency == b.frequency) {
                a.word.compareTo(b.word)
            } else {
                -a.frequency.compareTo(b.frequency)
            }
        }
        val sorted = set.sortedWith(comparator)
        return sorted.take(k).map { it.word }
    }

    data class Word(
        val word: String,
        val frequency: Int
    )
}