package cdaddr.advent2018

class Day05(val input: String) {
    fun react(s: String): StringBuilder {
        var txt = StringBuilder(s)
        loop@ while (true) {
            for (n in 1 until txt.length) {
                if (txt[n].toLowerCase() == txt[n - 1].toLowerCase() && txt[n] != txt[n - 1]) {
                    txt.delete(n - 1, n + 1)
                    continue@loop
                }
            }
            break
        }
        return txt
    }

    fun solvePart1(): Int {
        return react(this.input).length
    }

    fun solvePart2(x: Any): Unit {

    }
}
//fun main(args: Array<String>) {
//
//    var part2 = input.length
//
//
//    for(ch in 'a' .. 'z') {
//        val txt = StringBuilder(Regex("[$ch${ch.toUpperCase()}]").replace(input.toString(), ""))
//        react(txt)
//        if (txt.length < part2) {
//            part2 = txt.length
//        }
//    }
//    println("part 2: $part2")
//}
