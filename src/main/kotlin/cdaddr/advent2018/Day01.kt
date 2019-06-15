package cdaddr.advent2018

class Day01(inputTxt: List<String>) {
    private val input: List<Int> = inputTxt.map { it.toInt() }

    fun solvePart1(): Int {
        return input.sum()
    }

    fun solvePart2(): Int {
        var freq = 0
        val seen = mutableSetOf<Int>(freq)

        loop@ while (true) {
            for (num in input) {
                freq += num
                if (freq in seen) {
                    break@loop
                }
                seen.add(freq)
            }
        }
        return freq
    }
}
