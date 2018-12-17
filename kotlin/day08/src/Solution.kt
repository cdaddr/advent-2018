import java.io.File

data class Node(var children: MutableList<Node>, var meta: List<Int>) {
    fun totalMeta(): Int {
        return this.meta.sum() + this.children.map{ it.totalMeta() }.sum()
    }
    fun totalFancyMeta(): Int {
        return if (this.children.isEmpty()) {
            this.meta.sum()
        } else {
            this.meta.map {
                children.getOrNull(it-1)?.totalFancyMeta() ?: 0
            }.sum()
        }
    }
}

fun parse(input: List<Int>): Pair<Node, List<Int>> {
    var node = Node(mutableListOf(), emptyList())
    var (numChildren, numMeta) = input.take(2)
    var rest = input.drop(2)
    for(n in 1 .. numChildren) {
        val (child, etc) = parse(rest)
        rest = etc
        node.children.add(child)
    }
    node.meta = rest.take(numMeta)
    return Pair(node, rest.drop(numMeta))
}

fun main(args: Array<String>) {
    val input = File("input.txt").readText().trim().split(" ").map{ it.toInt() }
    //val input = "2 3 0 3 10 11 12 1 1 0 1 99 2 1 1 2".split(" ").map{ it.toInt() }
    val (node, _) = parse(input)
    println("part 1: ${node.totalMeta()}")
    println("part 2: ${node.totalFancyMeta()}")
}