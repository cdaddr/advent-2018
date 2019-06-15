package cdaddr.advent2018

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class Day01Test {
    private val sampleInput = listOf("+1", "-2", "+3", "+1")
    private val actualInput = Resources.resourceAsList("day01.txt")

    @Test
    fun `day01 part1 sample`() {
        val day = Day01(sampleInput)
        assertThat(day.solvePart1()).isEqualTo(3)
    }

    @Test
    fun `day01 part1 actual`() {
        val day = Day01(actualInput)
        assertThat(day.solvePart1()).isEqualTo(425)
    }

    @Test
    fun `day01 part2 sample`() {
        val day = Day01(sampleInput)
        assertThat(day.solvePart2()).isEqualTo(2)
    }

    @Test
    fun `day01 part2 actual`() {
        val day = Day01(actualInput)
        assertThat(day.solvePart2()).isEqualTo(57538)
    }
}
