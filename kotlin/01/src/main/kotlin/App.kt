
import java.io.File

fun main(args: Array<String>) {
    val nums = File("input.txt").readLines().map{ it.toInt() }

    println("part 1: ${nums.sum()}")

    var freq = 0
    var seen = mutableSetOf<Int>(freq)

    loop@ while(true) {
        for (num in nums) {
            freq += num
            if (freq in seen) {
                break@loop
            }
            seen.add(freq)
        }
    }

    println("part 2: ${freq}")
}
