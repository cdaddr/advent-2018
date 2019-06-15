package cdaddr.advent2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Day02Test {
    private val sampleInput = listOf(
        "abcdef",
        "bababc",
        "abbcde",
        "abcccd",
        "aabcdd",
        "abcdee",
        "ababab"
    )
    private val sampleInput2 = listOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")

    private val actualInput = Resources.resourceAsList("day02.txt")

    @Test
    fun `day02 part1 sample`() {
        val day = Day02(sampleInput)
        assertThat(day.solvePart1()).isEqualTo(12)
    }

    @Test
    fun `day02 part1 actual`() {
        val day = Day02(actualInput)
        assertThat(day.solvePart1()).isEqualTo(7872)
    }

    @Test
    fun `day02 part2 sample`() {
        val day = Day02(sampleInput2)
        assertThat(day.solvePart2()).isEqualTo("fgij")
    }

    @Test
    fun `day02 part2 actual`() {
        val day = Day02(actualInput)
        assertThat(day.solvePart2()).isEqualTo("tjxmoewpdkyaihvrndfluwbzc")
    }
}


