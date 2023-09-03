package tinkoff.autumn2023

class Mine {

    fun main() {
        val (spiritsCount, questionsCount) = readln().trim().split(" ").map { it.toInt() }
        val questions = mutableListOf<List<Int>>()

        repeat(questionsCount) {
            questions.add(readln().trim().split(" ").map { it.toInt() })
        }

        val spiritsBandCount = Array(spiritsCount+1) { 1 }
        val bands = mutableListOf<List<Int>>()

        repeat(spiritsCount) {
            bands.add(listOf(it + 1))
        }

        for (question in questions) {
            when (question.first()) {
                1 -> {
                    val firstBand = bands.first { it.contains(question[1]) }
                    if (firstBand.contains(question[2])) {
                        continue
                    }
                    val secondBand = bands.first { it.contains(question[2]) }
                    val newBand = firstBand + secondBand
                    bands.remove(firstBand)
                    bands.remove(secondBand)
                    bands.add(newBand)
                    newBand.forEach {
                        spiritsBandCount[it] += 1
                    }
                }

                2 -> {
                    val band = bands.first { it.contains(question[1]) }
                    if (band.contains(question[2])) {
                        println("YES")
                    } else {
                        println("NO")
                    }
                }

                3 -> {
                    println(spiritsBandCount[question[1]])
                }
            }
        }
    }
}