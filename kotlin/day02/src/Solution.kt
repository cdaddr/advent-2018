
import java.io.File

fun main(args: Array<String>) {
    var countTwo = 0
    var countThree = 0

    val lines = File("input.txt").readLines()
    for (line in lines) {
        val letters = line.toCharArray().groupBy{ it }.mapValues{ it.value.size }
        if (letters.any{ it.value == 2}) {
            countTwo++
        }
        if (letters.any{ it.value == 3 }) {
            countThree++
        }
    }
    println("${countTwo} * ${countThree} = ${countTwo * countThree}")

    for ((n, line1) in lines.withIndex()) {
        for(line2 in lines.drop(n+1)) {
            var diffs = 0
            for(pair in line1.toCharArray().zip(line2.toCharArray())) {
                if (pair.first != pair.second) {
                    diffs++
                    // println("${line1} ${line2} ${pair}")
                }
                if (diffs > 1) {
                    break
                }
            }
            if (diffs == 1) {
                println("part 2: ${line1} ${line2}")
                break
            }
        }
    }
}
