package cdaddr.advent2018

class Day02(val input: List<String>) {
    fun solvePart1(): Int {
        var countTwo = 0
        var countThree = 0

        for (line in input) {
            val letters = line.toCharArray()
                .groupBy { it }
                .mapValues { it.value.size }
            if (letters.any { it.value == 2 }) {
                countTwo++
            }
            if (letters.any { it.value == 3 }) {
                countThree++
            }
        }
        return countTwo * countThree
    }

    fun solvePart2(): String {
        var answer = ""
        for ((n, line1) in input.withIndex()) {
            for (line2 in input.drop(n + 1)) {
                var diffs = 0
                var diffIndex = 0
                for ((ch, pair) in line1.toCharArray().zip(line2.toCharArray()).withIndex()) {
                    if (pair.first != pair.second) {
                        diffs++
                        if (diffs > 1) {
                            break
                        }
                        diffIndex = ch
                    }
                }
                if (diffs == 1) {
                    answer = line1.replaceRange(diffIndex..diffIndex, "")
                    break
                }
            }
        }
        return answer
    }
}
