import java.io.File
fun react(txt: StringBuilder) {
    loop@ while(true) {
        for (n in 1 until txt.length) {
            if (txt[n].toLowerCase() == txt[n-1].toLowerCase() && txt[n] != txt[n-1]) {
                txt.delete(n-1, n+1)
                continue@loop
            }
        }
        break
    }
}

fun main(args: Array<String>) {
    val input = StringBuilder(File("input.txt").readText().trim())

    val part1 = StringBuilder(input)
    react(part1)
    println("part 1: ${part1.length}")

    var part2 = input.length


    for(ch in 'a' .. 'z') {
        val txt = StringBuilder(Regex("[$ch${ch.toUpperCase()}]").replace(input.toString(), ""))
        react(txt)
        if (txt.length < part2) {
            part2 = txt.length
        }
    }
    println("part 2: $part2")
}